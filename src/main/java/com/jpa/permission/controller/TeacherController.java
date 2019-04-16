package com.jpa.permission.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.permission.dao.TeacherOneToManyRepositiry;
import com.jpa.permission.dao.TeacherRepositiry;
import com.jpa.permission.entitys.Student;
import com.jpa.permission.entitys.Teacher;

@RestController
public class TeacherController {

	@Autowired
	private TeacherRepositiry teacher;
	
	@Autowired
	private TeacherOneToManyRepositiry teacherRepo;
	
	@RequestMapping("tea/{id}")
	@ResponseBody
	public Teacher getTea(@RequestParam("id") Integer id) {
		
		Teacher t = new Teacher();
		t.setName("Tome");
		
		Student s1 = new Student();
		s1.setName("JAVV");
		
		Student s2 = new Student();
		s2.setName("JAVV222");
		
		return teacher.save(t);
	}
	
	@RequestMapping("/dd")
	@ResponseBody
	public Optional<com.jpa.permission.onetomany.Teacher> OneToManyQuery() {
		System.out.println("OneToManyQuery-lazy"+teacherRepo.findById(5));
		return teacherRepo.findById(5);
	}
}
