package com.example.Excel.program;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class service {

	
	     @Autowired
	     private repo studentRepository;

	     public void uploadFile(MultipartFile file) throws IOException {
	         List<model> students = excelconfig.parseExcelFile(file.getInputStream());
	         studentRepository.saveAll(students);
	     }
	 }

