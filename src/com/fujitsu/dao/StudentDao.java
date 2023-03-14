package com.fujitsu.dao;

import java.util.List;

import com.fujitsu.entity.Student;

public interface StudentDao {
	int insertStudent(Student student);
	List<Student> selectStudent();
}
