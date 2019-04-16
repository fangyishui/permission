package com.jpa.permission.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.permission.entitys.Teacher;



public interface TeacherRepositiry extends JpaRepository<Teacher, Integer>{

//	User findByuserName(String userName);

//    List<User> findByuserNameContaining(String userName);
	
//    void saveTeacher(Teacher t);
}
