package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {

	@Id
	private Integer studentId;
	private Integer classId;
	private String className;
	private Integer schoolId;
	private String schoolName;
	private Integer studentMarks;
	private String studentName;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Integer getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", classId=" + classId + ", className=" + className + ", schoolId="
				+ schoolId + ", schoolName=" + schoolName + ", studentMarks=" + studentMarks + ", studentName="
				+ studentName + "]";
	}
	
	
	
}
