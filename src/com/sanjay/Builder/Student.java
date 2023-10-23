package com.sanjay.Builder;

import java.util.List;

public class Student {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String>subject;
	
	public Student(StudentBuilder builder) {
		this.rollNumber = builder.rollNumber;
		this.age = builder.age;
		this.fatherName = builder.fatherName;
		this.name = builder.name;
		this.motherName = builder.motherName;
		this.subject = builder.subject;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", subject=" + subject + "]";
	}
	
}
