package com.detail.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.detail.employee.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	Logger logger=LoggerFactory.getLogger(EmployeeRepositoryImpl.class);
	@Autowired
	JdbcTemplate jdbcTemplate;
//	private EmployeeService employeeService;
	@Override
	public List<Employee> getAllEmployee() {
//		@SuppressWarnings("deprecation");
		logger.error("Request getAllEmployee from EmployeeRepository");
		
		return jdbcTemplate.query("select * from student",(rs,rowNum)->
		new Employee(
				rs.getLong("id"),
				rs.getString("name"),
				rs.getString("designation"),
				rs.getString("organisation")
				));
	}

	@Override
	public Employee findByEmployeeId(long id) {
		@SuppressWarnings("deprecation")
		Employee employee =this.jdbcTemplate.queryForObject(
				 "select * from employeeenuka where id = ?",
				 new Object[]{id},
				  new RowMapper<Employee>() {
					 public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						 Employee employee = new Employee();
						 employee.setId(rs.getLong("id"));
			                return employee;
			            }
			        });
			
			return employee;
		}


//	@Override
//	public Student findStudentById(long id) {
//		@SuppressWarnings("deprecation")
//		Student student = this.jdbcTemplate.queryForObject(
//		        "select * from student where id = ?",
//		        new Object[]{id},
//		        new RowMapper<Student>() {
//		            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//		            	Student student = new Student();
//		            	student.setId(rs.getLong("id"));
//		                student.setClgName(rs.getString("clgName"));
//		                student.setGender(rs.getString("Gender"));	
//		                student.setName(rs.getString("name"));
//		                student.setSem(rs.getString("sem"));
//		                student.setStream(rs.getString("stream"));
//		                
//		                return student;
//		            }
//		        });
//		
//		return student;
//	}

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
