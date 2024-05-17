package com.example.Excel.program;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class model {
	
	@Id
	private Long id;
	private String name;
	private double overallmark;
	private String grade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getOverallmark() {
		return overallmark;
	}
	public void setOverallmark(double overallmark) {
		this.overallmark = overallmark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	private String Mobileno;
	

}
