package com.nit.controller;

import com.nit.service.StudentService;

public class StudentController {
	
	private StudentService service;	
	
	//constructor injection
	public StudentController(StudentService service) {
		this.service=service;
	}
}
