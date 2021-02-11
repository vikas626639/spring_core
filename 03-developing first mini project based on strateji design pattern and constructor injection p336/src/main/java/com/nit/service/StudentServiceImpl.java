package com.nit.service;

import com.nit.dao.StudentDAO;
import com.nit.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO dao;
	//constructor injection;
	public StudentServiceImpl(StudentDAO dao) {
		this.dao=dao;
	}
	
	@Override
	public String processResult(StudentDTO dto) throws Exception {
		//get record frm dto
		
		
		
		return null;
	}
}
