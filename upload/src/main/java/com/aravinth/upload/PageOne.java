package com.aravinth.upload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="personaldetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageOne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	private String name;
	
	@Column(unique=true)
	private String email;
	
	@Column(unique=true)
	private String phone;
	
	private String password;
	private String city;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="edid")
	private PageTwo pagetwo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="empid")
	private PageThree pagethree;

}	
