package com.fujitsu.service;

import java.util.List;

import com.fujitsu.dao.StudentDao;
import com.fujitsu.entity.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public int addStudent(Student student) {
		studentDao.insertStudent(student);
		int i = 1;
		System.out.println(1/i);
		return 1;
	}

	public List<Student> queryStudent() {
		return studentDao.selectStudent();
	}
}
