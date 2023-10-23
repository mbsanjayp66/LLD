package com.sanjay.CompositePattern;

public class Accountant implements Employee {

	private int id;
	private String name;
	private double salary;

	public Accountant(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("=========================");
		System.out.println("Id =" + getId());
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("=========================");

	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
