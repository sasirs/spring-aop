package com.sasi.spring.aop.spring_aop_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sasi.spring.aop.spring_aop_example.model.Employee;
import com.sasi.spring.aop.spring_aop_example.service.EmployeeService;

@SpringBootApplication
public class SpringAopExampleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringAopExampleApplication.class, args);
		
		ApplicationContext applicationContext =  SpringApplication.run(SpringAopExampleApplication.class, args);
		  EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		  employeeService.addEmployee(new Employee(100L, "ramesh", "fadatare", "ramesh@gmail.com"));
		  employeeService.getEmployeeById(100L);
		  employeeService.getAllEmployees();
		  
	}

}
