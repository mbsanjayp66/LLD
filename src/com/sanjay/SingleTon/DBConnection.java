package com.sanjay.SingleTon;

public class DBConnection {
	private static DBConnection obj;
	
	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		System.out.println("Connection Created");
		if(obj==null) {
			synchronized (DBConnection.class) {
				if(obj==null) {
					obj = new DBConnection();
				}
			}
			
		}
		return obj;
	}
}
