package com.onetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoonemapping.entity.TeacherSubject;

@Repository
public interface TeacherSubjectRepository extends JpaRepository<TeacherSubject, Integer>{

}
