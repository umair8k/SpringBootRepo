package com.dda.entity;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RegionMaster {
	public static final String SEQUENCE_NAME = "master_sequence";
	@Id
	private int regionMasterId;

	private String regionName;

	private int regionCode;

	private Date createdDate;


	public int getRegionMasterId() {
		return regionMasterId;
	}
	public void setRegionMasterId(int regionMasterId) {
		this.regionMasterId = regionMasterId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public int getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}




}
