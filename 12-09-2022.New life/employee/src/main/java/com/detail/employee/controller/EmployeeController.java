package com.detail.employee.controller;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.detail.employee.dto.BaseResponseDTO;
import com.detail.employee.model.Employee;
import com.detail.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;
	@GetMapping(value="/getAllEmployee")
	public ResponseEntity<?>getAllEmployee() {
		logger.info("Request has entered getAllEmployee endpoint");
		List<Employee>result=employeeService.getAllEmployee();
		if(result!=null) {
			logger.info("result of getAllEmployee is executed");
			BaseResponseDTO responseDTO = new BaseResponseDTO();
			responseDTO.setError(false);
			responseDTO.setHttpCode("200");
			responseDTO.setData(responseDTO);
			return ResponseEntity.ok(responseDTO);
		}else {
			logger.error("result of getAllEmployee is null");
			BaseResponseDTO responseDTO=new BaseResponseDTO();
			responseDTO.setError(false);
			responseDTO.setHttpCode("400");
			responseDTO.setData("There is some problem in getting data of getAll employee");
			return ResponseEntity.badRequest().body(responseDTO);
		}
	}
}

//logger.info("Request has entered getAllStudents endpoint");
//List<Student> result= studentService.getAllStudents();
//if(result!=null) {
//	logger.info("result of getAllStudent is executed");
//	BaseResponseDTO responseDTO = new BaseResponseDTO();
//	responseDTO.setError(false);
//	responseDTO.setHttpCode("200");
//	responseDTO.setData(result);
//	return ResponseEntity.ok(responseDTO);
//}else {
//	logger.error("GetAll Student list is null");
//	BaseResponseDTO responseDTO = new BaseResponseDTO();
//	responseDTO.setError(true);
//	responseDTO.setHttpCode("400");
//	responseDTO.setData("There is some problem in getting the data");
//	return ResponseEntity.badRequest().body(responseDTO);
//}
