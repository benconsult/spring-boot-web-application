package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDaoImpl;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDaoImpl employeeDao;

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee findEmployeeById(int id) {
		
		return employeeDao.findEmployeeById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		
		employeeDao.addEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		
		employeeDao.deleteEmployee(id);
	}

}
