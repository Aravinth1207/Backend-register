package com.aravinth.upload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employmentdetails")
public class PageThree {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empid;
	
	private String companyname;
	private int salary;
	private String designation;
	private String jobtype;
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public PageThree(long empid, String companyname, int salary, String designation, String jobtype) {
		super();
		this.empid = empid;
		this.companyname = companyname;
		this.salary = salary;
		this.designation = designation;
		this.jobtype = jobtype;
	}
	public PageThree() {
		super();
	}
	
}
