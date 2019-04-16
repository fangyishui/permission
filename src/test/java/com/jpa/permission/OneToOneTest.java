package com.jpa.permission;

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

}
