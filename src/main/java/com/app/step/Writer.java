package com.app.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.app.model.Student;

public class Writer implements ItemWriter<Student> {

	@Override
	public void write(List<? extends Student> items) throws Exception {
		System.out.println("--from Writer---");
		System.out.println(items);
		
	}

}
