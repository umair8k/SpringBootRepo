package com.onetoonemapping.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoonemapping.entity.Teacher;
import com.onetoonemapping.entity.TeacherSubject;
import com.onetoonemapping.repository.TeacherRepository;
import com.onetoonemapping.repository.TeacherSubjectRepository;
import com.onetoonemapping.service.TeacherService;
@Service	
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public Teacher createTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override 
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacher(int teacherId) {
		Optional<Teacher> optionalTeacher=teacherRepository.findById(teacherId);
		if(optionalTeacher.isEmpty()) {
			return optionalTeacher.get();
		}		return null;
	}

	@Override
	public void deleteTeacher(int teacherId) {
		teacherRepository.deleteById(teacherId);
	}

	@Override
	public List<Teacher> getAllTeacher(){
		return teacherRepository.findAll();
	}
}
