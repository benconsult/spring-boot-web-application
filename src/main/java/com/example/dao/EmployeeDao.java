package com.example.dao;

import java.util.List;

import com.example.model.*;

public interface EmployeeDao {
  
	public List<Employee> getAllEmployee();
	
	public Employee findEmployeeById(int id);
	
	public void addEmployee(Employee employee);
	
	public  void updateEmployee(Employee employee);
	 
	public  void deleteEmployee(int id);
	
	
}
