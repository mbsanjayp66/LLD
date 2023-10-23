package com.sanjay.ProxyDesignPatern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String Client, EmployeeDo obj) throws Exception {
		System.out.println("create");
	}

	@Override
	public void delete(String Client, EmployeeDo obj) throws Exception {
		System.out.println("delete");
	}

	@Override
	public EmployeeDo get(String Client, int employeeId) throws Exception {
		System.out.println("fetching");
		return new EmployeeDo();
	}

}
