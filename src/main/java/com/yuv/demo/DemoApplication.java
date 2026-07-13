package com.yuv.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		Student student = new Student();
		student.setName("YUV");
		student.setAge(45);
		student.display();
	}

}
