package com.dda.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SuperAdminEmail {
	
	public static final String SEQUENCE_NAME = "admin_sequence";
	@Id
	private int adminId;
	
	private String name;
	
	@Indexed(unique=true)
	private String email;
	
	private Date createdDate;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int i) {
		this.adminId = i;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	

}
