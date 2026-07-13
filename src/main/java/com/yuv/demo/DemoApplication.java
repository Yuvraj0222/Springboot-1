package com.yuv.demo;

import com.yuv.demo.dependency_package.Orderservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);
//		Student student = new Student();
//		student.setName("YUV");
//		student.setAge(45);
//		student.display();

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Student  student  = context.getBean(Student.class);
//		student.setName("YUV");
//		student.setAge(45);
//		System.out.println(student.getName());
//		System.out.println(student.getAge());

		Orderservice orderservice = context.getBean(Orderservice.class);
		orderservice.placeorder();
	}
}


