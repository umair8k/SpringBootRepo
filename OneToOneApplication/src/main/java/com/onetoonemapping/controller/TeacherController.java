package com.onetoonemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonemapping.entity.Teacher;
import com.onetoonemapping.service.TeacherService;

@RestController
@RequestMapping(value="/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;


	@PostMapping(value="/create")
	@ResponseBody
	public Teacher createTeacher(@RequestBody Teacher teacher) {
		Teacher teacherResponse=teacherService.createTeacher(teacher);
		return teacherResponse;
	}


	@GetMapping("/{teacherId}")
	public Teacher getTeacher(@PathVariable int teacherId) {
		Teacher teacherResponse=teacherService.getTeacher(teacherId);
		return teacherResponse;
	}

	@GetMapping("/teachers")
	public List<Teacher> getAllTeacher(){
		List<Teacher> teacherResponse=teacherService.getAllTeacher();
		return teacherResponse;
	}
	@DeleteMapping("/{teacherId}")
	public String deleteTeacher(@PathVariable int teacherId) {
		teacherService.deleteTeacher(teacherId);
		return teacherId+" Teacher deleted succesfully";
	}

	@PutMapping("/teacher")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		Teacher teacherResponse=teacherService.updateTeacher(teacher);
		return teacherResponse;
	}

}
