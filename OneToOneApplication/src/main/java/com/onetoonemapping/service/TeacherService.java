package com.onetoonemapping.service;

import java.util.List;

import com.onetoonemapping.entity.Teacher;


public interface TeacherService {
	 	public Teacher createTeacher(Teacher teacher);
	 	public Teacher updateTeacher(Teacher teacher);
	 	public Teacher getTeacher(int teacherId);
	 	public void deleteTeacher(int teacherId);
	 	public List<Teacher> getAllTeacher();
		

}
