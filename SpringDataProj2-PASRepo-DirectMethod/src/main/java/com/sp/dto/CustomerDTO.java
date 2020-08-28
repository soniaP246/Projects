package com.sp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {
	
	
	private Integer cno;
	private String cname;
	private String cadd;
	private double billAmt;

}
