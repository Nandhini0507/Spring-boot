package com.example.Excel.program;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class excelconfig {

	public static List<model> parseExcelFile(InputStream input) throws IOException
	{
		List<model> ss=new ArrayList<>();
		
		try(Workbook book = new XSSFWorkbook(input))
		
		{
			Sheet s=book.getSheetAt(0);
	            Iterator<Row> rowIterator = s.iterator();

	           
	            if (rowIterator.hasNext()) {
	                rowIterator.next();
	            }

	            while (rowIterator.hasNext()) {
	                Row row = rowIterator.next();
	                
	                model student = new model();

	                student.setId((long) row.getCell(0).getNumericCellValue());
	                student.setName(row.getCell(1).getStringCellValue());
	               student.setOverallmark(row.getCell(2).getNumericCellValue());
	                student.setGrade(row.getCell(3).getStringCellValue());

	                ss.add(student);
	            }
			
		}
		return ss;
		
	}
}
	
