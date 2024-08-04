package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Employee;
import com.example.demo.repo.EmployeeRepo;
@Service
public class EmployeeService {
@Autowired
	EmployeeRepo repo;
	
//insert an employee

public Employee insert(Employee e) {
	return repo.save(e);
}


//retrieve all records 

public List<Employee> getall(){
	return repo.findAll();
}

public List<Employee> insertAll(List<Employee> e) {
	return repo.saveAll(e);
}


public Optional<Employee> getbyId(int id){
	return repo.findById(id);
}

public void delete(int id) {
	repo.deleteById(id);
}


//update 
public Employee updateEmployee(Employee e) {
	Employee ee=repo.findById(e.getEid()).orElse(null);
	ee.setEname(e.getEname());
	ee.setPhono(e.getPhono());
	return repo.save(ee);
}

public List<Employee> findbyName(String name,int id){
	return repo.findbyName(name, id);
}
	
}
