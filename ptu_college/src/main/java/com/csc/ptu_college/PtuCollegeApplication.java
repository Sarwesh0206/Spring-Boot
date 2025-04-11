package com.csc.ptu_college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PtuCollegeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(PtuCollegeApplication.class, args);
		
		EIStudent s1=var.getBean(EIStudent.class);
		System.out.println(s1);
		s1.show();
		
	}

}
