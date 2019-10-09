package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

public List<Employee> getAllEmployee();
	
	public Employee findEmployeeById(int id);
	
	public void addEmployee(Employee employee);
	
	public  void updateEmployee(Employee employee);
	 
	public  void deleteEmployee(int id);
	
	
}
