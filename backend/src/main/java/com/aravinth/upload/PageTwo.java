package com.aravinth.upload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="educationdetails")
public class PageTwo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long edid;
	private String school;
	private String highschool;
	private int schoolm;
	private int highschoolm;
	public long getEdid() {
		return edid;
	}
	public void setEdid(long edid) {
		this.edid = edid;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getHighschool() {
		return highschool;
	}
	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}
	public int getSchoolm() {
		return schoolm;
	}
	public void setSchoolm(int schoolm) {
		this.schoolm = schoolm;
	}
	public int getHighschoolm() {
		return highschoolm;
	}
	public void setHighschoolm(int highschoolm) {
		this.highschoolm = highschoolm;
	}
	public PageTwo(long edid, String school, String highschool, int schoolm, int highschoolm) {
		super();
		this.edid = edid;
		this.school = school;
		this.highschool = highschool;
		this.schoolm = schoolm;
		this.highschoolm = highschoolm;
	}
	public PageTwo() {
		super();
	}
	
	
}
