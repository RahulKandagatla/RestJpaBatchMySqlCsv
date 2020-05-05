package com.app.step;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.model.Student;
import com.app.repository.StudentJpaRepository;
import com.app.sevice.BatchService;

public class Reader implements ItemReader<Student> {

	@Autowired
	BatchService service;
	
	@Autowired
	StudentJpaRepository repo;
	
	@Override
	public Student read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		List<Student> list=repo.findAllBySchoolId(111);
		//List<Student> list=service.getStudentDataBySchoolId(111);
		return list.get(0);
	}

}
