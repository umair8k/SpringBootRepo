package com.onetoonemapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teacherId;

	private String teacherName;
	private String address;
	private long phoneNo;
	
	@JsonManagedReference
	@OneToOne(mappedBy="teacher", cascade=CascadeType.ALL)
	private TeacherSubject teacherSubject;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public TeacherSubject getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(TeacherSubject teacherSubject) {
		this.teacherSubject = teacherSubject;
	}


}
