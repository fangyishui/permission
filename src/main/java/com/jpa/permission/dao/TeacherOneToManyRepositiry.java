package com.jpa.permission.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.permission.onetomany.Teacher;

public interface TeacherOneToManyRepositiry extends JpaRepository<Teacher, Integer>{

	Teacher findTeacherByName(String name);
}
