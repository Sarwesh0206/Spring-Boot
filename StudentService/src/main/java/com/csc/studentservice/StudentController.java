package com.csc.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

	@Autowired
	
	private StudentService service;
	
	@PostMapping("/studentservice")
	
	public void inserting(@RequestBody Student stud) {
	     service.insertRecord(stud);
	}
	
}
