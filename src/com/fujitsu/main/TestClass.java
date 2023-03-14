package com.fujitsu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fujitsu.entity.Student;
import com.fujitsu.service.StudentService;

public class TestClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring.xml");
		
		StudentService service = (StudentService) ctx.getBean("studentService");
		Student student = new Student();
		student.setName("wangkai");
		student.setAge(40);
		service.addStudent(student);
		
		///returnTest();
	}
	
	public static int returnTest() {
		return 0;
	}

}
