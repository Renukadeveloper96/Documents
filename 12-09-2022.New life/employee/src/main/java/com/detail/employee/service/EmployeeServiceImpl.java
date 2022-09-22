package com.detail.employee.service;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.detail.employee.dao.EmployeeRepository;
import com.detail.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Autowired EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee(){
		try {
			logger.info("request getAllEmployee from EmployeeServiceImpl ");
			return employeeRepository.getAllEmployee();
		}catch(Exception e) {
			logger.error("try catch in block getAllEmployee from EmployeeServiceImpl "+e);
			return null;
		}
	}
	@Override
	public Employee findByEmployeeId(long id) {
		try {
			logger.info("request getByEmployeeId from EmployeeServiceImpl ");
		return employeeRepository.findByEmployeeId(id);
	}catch(Exception e) {
		logger.error("try catch in block getByEmployeeId from EmployeeServiceImpl "+e);
		return null;
	}
	}
	@Override
	public int saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteByEmployeeId(long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
