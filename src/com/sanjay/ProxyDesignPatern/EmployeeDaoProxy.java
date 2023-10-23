package com.sanjay.ProxyDesignPatern;

public class EmployeeDaoProxy implements EmployeeDao {
	EmployeeDao employeeDao;
	
	public EmployeeDaoProxy() {
		employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public void create(String Client, EmployeeDo obj) throws Exception {
		if(Client.equals("Admin")) {
			 employeeDao.create(Client, obj);
		}else {
			throw new Exception("Access Denied");
		}
		
	}

	@Override
	public void delete(String Client, EmployeeDo obj) throws Exception {
		if(Client.equals("Admin")) {
			employeeDao.delete(Client, obj);
		}else {
			throw new Exception("Access Denied");
		}
		
	}

	@Override
	public EmployeeDo get(String Client, int employeeId) throws Exception {
		if(Client.equals("Admin") || Client.equals("User")) {
			return employeeDao.get(Client, employeeId);
		}else {
			throw new Exception("Access Denied");
		}
		
	}

}
