package com.sanjay.ProxyDesignPatern;

public interface EmployeeDao {
	public void create(String Client,EmployeeDo obj) throws Exception;
	public void delete(String Client,EmployeeDo obj) throws Exception;
	public EmployeeDo get(String Client,int employeeId)throws Exception;
	
}
