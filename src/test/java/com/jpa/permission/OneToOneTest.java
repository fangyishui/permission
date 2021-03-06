package com.jpa.permission;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.permission.dao.TeacherRepositiry;
import com.jpa.permission.entitys.Student;
import com.jpa.permission.entitys.Teacher;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToOneTest {
	
	@Autowired
	private TeacherRepositiry teacherRepo;
	
	@Test
	public void OneToOneAdd() {
		
		Student stu = new Student();
		
		stu.setName("Jack2");
		
		Teacher tea = new Teacher();
		
		tea.setName("TOm2");
		tea.setStu(stu);
		
		teacherRepo.save(tea);
		
	}
	
	@Test
	@Transactional
	public void OneToOneQuery() {
		System.out.println("OneToOneQuery-lazy"+teacherRepo.findById(4));
	}
	
	@Test
	@Transactional
	public void OneToOneUpdate() {
		
		Student stu = new Student();
		stu.setName("bbbJack2");
		
		Teacher tea = new Teacher();
		tea.setId(3);
		tea.setName("HBBBB--11");
		tea.setStu(stu);
		teacherRepo.save(tea);
	}
}
