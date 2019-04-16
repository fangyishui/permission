package com.jpa.permission;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.permission.dao.TeacherOneToManyRepositiry;
import com.jpa.permission.onetomany.Student;
import com.jpa.permission.onetomany.Teacher;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyTest {
	
	@Autowired
	private TeacherOneToManyRepositiry teacherRepo;
	
	@Test
	public void OneToManyAdd() {
		
		Student stu = new Student();
		stu.setName("Jack1");
		Student stu2 = new Student();
		stu2.setName("Jack2");
		
		List<Student> stus = new ArrayList<Student>();
		stus.add(stu);
		stus.add(stu2);
		
		Teacher tea = new Teacher();
		tea.setName("Tom");
		
		tea.setStus(stus);
		
//		teacherRepo.save(tea);
		teacherRepo.saveAndFlush(tea);
	}
	
	@Test
	@Transactional
	public void OneToManyQuery() {
//		System.out.println("OneToManyQuery-lazy"+teacherRepo.findById(5));
		Optional<Teacher> findById = teacherRepo.findById(4);
		System.out.println("============"+findById);
	}
	
	@Test
	@Transactional
	public void OneToManyQueryByName() {
		System.out.println("OneToManyQuery-lazy"+teacherRepo.findTeacherByName("TOm2"));
	}
	
	@Test
	@Transactional
	public void OneToManyUpdate() {
		
		Student stu = new Student();
		stu.setName("bbbJack2");
		
		Teacher tea = new Teacher();
		tea.setId(3);
		tea.setName("HBBBB--11");
//		tea.setStu(stu);
		teacherRepo.save(tea);
	}
	
	@Test
	public void OneToManyDelete() {
		teacherRepo.deleteById(1);
	}
	
}
