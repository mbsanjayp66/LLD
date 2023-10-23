package com.sanjay.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public BankManager(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 List<Employee> employees = new ArrayList<Employee>();  

	@Override
	public int getId() {
		return id;  
	}

	@Override
	public String getName() {
		return name;  
	}

	@Override
	public double getSalary() {
		return salary;  
	}

	@Override
	public void print() {
		System.out.println("==========================");  
	      System.out.println("Id ="+getId());  
	      System.out.println("Name ="+getName());  
	      System.out.println("Salary ="+getSalary());  
	      System.out.println("==========================");  
	      for(Employee e:employees) {
	    	  e.print();
	      }
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);  
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);  
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);  
	}

}
