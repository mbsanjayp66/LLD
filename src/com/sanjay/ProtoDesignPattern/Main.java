package com.sanjay.ProtoDesignPattern;

public class Main {
	public static void main(String args[]) {
		Student s1 = new Student(10, 10, "Sanjay Kumar");
		Student s2 = (Student)s1.getClone();
		s1.setName("Pankaj");
		System.out.println(s2);
		System.out.println(s1);
		
	}
}
