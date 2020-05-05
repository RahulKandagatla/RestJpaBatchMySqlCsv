package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Student;


public interface StudentJpaRepository extends JpaRepository<Student, Integer>{

	List<Student> findAllBySchoolId(Integer schoolId);

}
