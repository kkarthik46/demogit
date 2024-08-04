package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;


@SpringBootTest
public class SpringBootJpaApplicationTests {

	@Autowired
	EmployeeService service;
	
	//@Test
	public void test1() {
		Employee e=new Employee();
		e.setEname("vinesh");
		e.setPhono("11123478");	
		assertNotNull(service.insert(e));
	}

	
	

}
