package com.aravinth.upload;

import com.google.cloud.storage.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;


@RestController
@RequestMapping("")
@CrossOrigin("http://localhost:3000/")
public class Controller {

    @Autowired
    private Repo repo;

    String projectId = "spring-347306";
    String bucketName = "resume-react";


    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile1(@RequestParam("file")MultipartFile file){
        String Name = file.getOriginalFilename();
        if (file.isEmpty()){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File is missing in request");
        }

        try{
            InputStream is = file.getInputStream();
            byte data[] = new byte[is.available()];
            is.read(data);
            BlobId blobId = BlobId.of(bucketName, file.getOriginalFilename());
            BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
            storage.create(blobInfo,data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Model response = new Model();
        response.setFileName(Name);
        response.setFileName(Name);
        response.setPath("gs://"+bucketName+"/"+Name);
        repo.save(response);
        return ResponseEntity.ok("File uploaded Successfully");
   }
    
     @PostMapping("/delete")
    public ResponseEntity <String> deleteFile(@RequestParam("filename")String fileName){
    	BlobId id = BlobId.of(bucketName, fileName);
    	boolean deleted= storage.delete(id);
    	if (deleted) {
    	repo.deleteByFileName(fileName);
    	return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<>("File Not Found",HttpStatus.BAD_REQUEST);
    	}
    }

}
