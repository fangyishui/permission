package com.jpa.permission.entitys;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_teacher")
@Data
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 100)
	private String name;

	@OneToOne(cascade=CascadeType.PERSIST)
	private Student stu;
}
