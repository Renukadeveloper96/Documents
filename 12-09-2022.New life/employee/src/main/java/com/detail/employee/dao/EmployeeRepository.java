package com.detail.employee.dao;

import java.util.List;

import com.detail.employee.model.Employee;

public interface EmployeeRepository {

	public List<Employee>getAllEmployee();
	public Employee findByEmployeeId(long id);
	public int saveEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public void deleteByEmployeeId(long id);
	
}
