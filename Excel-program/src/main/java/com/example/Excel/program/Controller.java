package com.example.Excel.program;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Controller {
	

	    @Autowired
	    service studentService;

	    @PostMapping("/upload")
	    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
	        try {
	            if (file.isEmpty()) {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No file uploaded.");
	            }
	            studentService.uploadFile(file);
	            return ResponseEntity.ok().body("File uploaded successfully.");
	        } catch (IOException e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload the file: " + e.getMessage());
	        }
	    }
	}

