package com.aravinth.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
@CrossOrigin("http://localhost:3000/")
public class PageOneController {
	
	@Autowired
	private PageOneRepo repo;
	
	@PostMapping("/savedetails")
	public ResponseEntity<String> saveDetails(@RequestBody PageOne pageone){
		repo.save(pageone);
		return ResponseEntity.ok("Data Saved");
	}
	
	@GetMapping("/{email}")
	public ResponseEntity<PageOne> getByEmail(@PathVariable("email") String email){
		return new ResponseEntity<PageOne>(repo.findByEmail(email), HttpStatus.OK);
	}
}
