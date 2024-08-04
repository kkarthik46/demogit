package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.pojo.Employee;
                                                    //POJO    type of the PK
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

String sql="select employee from Employee employee where employee.ename=?1 and employee.eid=?2";
	
	@Query(sql)
	public List<Employee> findbyName(String name,int id);
	
}
