package com.hsi.cvparse.dto;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;

public class CandidateInfoDto implements Serializable{
	
	private static final long serialVersionUID = -7652701747853841210L;

	@CsvBindByName(column = "name")
	private String name; 
	
	@CsvBindByName(column = "email")
	private String email;
	
	@CsvBindByName(column = "mobile")
	private String mobile;
	
	@CsvBindByName(column = "qualification")
	private String qualification;
	
	@CsvBindByName(column = "experience")
	private String experience;
	
	@CsvBindByName(column = "primaryskill")
	private String primaryskill;
	
	@CsvBindByName(column = "secondaryskill")
	private String secondaryskill;
	
	@CsvBindByName(column = "resumePostedDate")
	private String resumePostedDate;
	
	public CandidateInfoDto() 
	{
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getPrimarySkill() {
		return primaryskill;
	}

	public void setPrimarySkill(String primaryskill) {
		this.primaryskill = primaryskill;
	}

	public String getSecondarySkill() {
		return secondaryskill;
	}

	public void setSecondarySkill(String secondaryskill) {
		this.secondaryskill = secondaryskill;
	}

	public String getResumePostedDate() {
		return resumePostedDate;
	}

	public void setResumePostedDate(String resumePostedDate) {
		this.resumePostedDate = resumePostedDate;
	}

	

}
