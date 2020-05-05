package com.app.sevice;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentJpaRepository;

@Service
public class BatchService {

	@Autowired
	StudentJpaRepository repo;
	
	@Autowired
	JobLauncher jobLauncher;
	@Autowired
	private Job job;
	
	public void jobInvoker() throws Exception {
		JobParameters jobParameters=new JobParametersBuilder()
				.addLong("time", System.currentTimeMillis())
				.toJobParameters();
		jobLauncher.run(job, jobParameters);
	}
	
	public List<Student> getStudentDataBySchoolId(Integer schoolId) throws Exception {
		//List<Student> studentList=repo.findAllBySchoolId(schoolId);
		jobInvoker();
		//System.out.println(studentList);
		
		return null;
		
	}

	
}
