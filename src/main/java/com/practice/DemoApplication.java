package com.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee emp=context.getBean("emp",Employee.class);
		int s=emp.getsqure();
		System.out.println("squre is "+s);
	}
}
