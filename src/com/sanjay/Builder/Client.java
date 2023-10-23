package com.sanjay.Builder;

public class Client {

	public static void main(String[] args) {
		Director d1 = new Director(new EngineeringStudentBuilder());
		Director d2 = new Director(new MBA());
		Student s1 = d1.createStudent();
		Student s2 = d2.createStudent();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
