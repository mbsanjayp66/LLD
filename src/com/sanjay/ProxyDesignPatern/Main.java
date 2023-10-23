package com.sanjay.ProxyDesignPatern;

public class Main {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoProxy();
		try {
			employeeDao.create("Admi", new EmployeeDo());
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
