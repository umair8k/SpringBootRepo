package com.onetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoonemapping.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
}
