//to insert values
package com.csc.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	public void insertRecord (Student stud)
	{
		repo.save(stud);
	}

}
