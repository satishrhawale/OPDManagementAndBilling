package com.opd.management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String first_name;
	private String last_name;
	private String username;
	private String address;
	private String contact;
	
	public Registration(String first_name, String last_name, String username, String address,
			String contact) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.address = address;
		this.contact = contact;
	}
	
	

}
