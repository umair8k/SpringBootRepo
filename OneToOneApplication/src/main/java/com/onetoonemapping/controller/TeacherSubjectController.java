package com.onetoonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonemapping.entity.TeacherSubject;
import com.onetoonemapping.repository.TeacherSubjectRepository;

@RestController
public class TeacherSubjectController {
	@Autowired
	private TeacherSubjectRepository teacherSubjectRepository;
	
	@GetMapping("/Subject/get/all")
	public List<TeacherSubject> getTeacherSubject(){
		return teacherSubjectRepository.findAll();
	}

}
