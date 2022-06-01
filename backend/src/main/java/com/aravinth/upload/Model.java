package com.aravinth.upload;



import com.google.api.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="BlobTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Blob_ID;
    private String fileName;
    private String path;


}
