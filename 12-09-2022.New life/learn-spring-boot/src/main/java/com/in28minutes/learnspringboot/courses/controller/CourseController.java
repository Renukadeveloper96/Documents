package com.in28minutes.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Learn Microservice","in28minutes"),new Course(2,"Learn spring-boot","in28minutes"));
	}
	
	//http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Course getCourseDetails(){
		return new Course(1,"Learn Microservice","in28minutes");
	}

}