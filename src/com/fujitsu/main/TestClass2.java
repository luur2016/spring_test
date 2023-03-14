package com.fujitsu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fujitsu.service.StudentService;

public class TestClass2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring.xml");
		StudentService service = (StudentService) ctx.getBean("studentService");
		service.queryStudent();
	}

}
