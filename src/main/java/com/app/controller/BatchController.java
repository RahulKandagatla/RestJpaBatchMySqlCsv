package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.sevice.BatchService;

@RestController
public class BatchController {
	
	@Autowired
	BatchService service;

	@PostMapping("/batch/school")
	String getStudentDataBySchoolId(@RequestBody Student student) throws Exception {
		
		service.getStudentDataBySchoolId(student.getSchoolId());
		
		
		return "Batch Process Done";
		
	}
}
