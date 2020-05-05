package com.app.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.model.Student;
import com.app.step.Processor;
import com.app.step.Reader;
import com.app.step.Writer;

@Configuration
public class BatchConfig {

	@Autowired
	private StepBuilderFactory sf;
	
	@Autowired
	private JobBuilderFactory jf;
	
	
	@Bean
	public Step stepA() {
		return sf.get("stepA")
				.<Student,Student>chunk(5)
				.reader(new Reader())
				.processor(new Processor())
				.writer(new Writer())
				.build();
	}
	
	@Bean
	public Job job() {
		return (Job) jf.get("JobA")
				.incrementer(new RunIdIncrementer())
				.start(stepA())
				.build();
	}
}
