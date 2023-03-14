package com.fujitsu.service;

import java.util.List;

import com.fujitsu.entity.Student;

public interface StudentService {
	int addStudent(Student student);
	List<Student> queryStudent();
}
