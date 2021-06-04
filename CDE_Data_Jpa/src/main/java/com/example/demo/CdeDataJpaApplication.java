package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CdeDataJpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=	SpringApplication.run(CdeDataJpaApplication.class, args);
	   
		EmployeeService empServe=ctx.getBean(EmployeeService.class);
	
	
	     List <Employee> emp=empServe.findByNameIn(Arrays.asList("abc","mno","stu"));
		
	      System.out.println(emp);
	}

}
