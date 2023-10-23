package com.sanjay.Builder;

public class Director {
	StudentBuilder studentBuilder;
	
	public Director(StudentBuilder builder) {
		this.studentBuilder = builder;
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}else if(studentBuilder instanceof MBA) {
			return createMBAStudent();
		}
		return null;
	}

	private Student createMBAStudent() {
		
		return studentBuilder.setAge(10).setFatherName("Dine").setName("Sanj").setSubject().build();
	}

	private Student createEngineeringStudent() {
		return studentBuilder.setAge(1111).setMotherName("neelam").setSubject().build();
	}
}
