package com.app.step;

import org.springframework.batch.item.ItemProcessor;

import com.app.model.Student;

public class Processor implements ItemProcessor<Student, Student> {

	@Override
	public Student process(Student item) throws Exception {
		System.out.println(item);
		return item;
	}

}
