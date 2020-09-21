package com.sp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity

public class Employee {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Long salary;
	
	@Transient
	private String captcha;
	
	@Transient
	private String hidden;
	
	@Transient
	private String image;

}
