package com.sanjay.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
	int userId;
	String userName;
	Address address;
	Cart userCartDetails;
	List<Integer>orderId;
	
	public User() {
		userCartDetails = new Cart();
		orderId = new ArrayList<>();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Cart getUserCartDetails() {
		return userCartDetails;
	}

	public void setUserCartDetails(Cart userCartDetails) {
		this.userCartDetails = userCartDetails;
	}

	public List<Integer> getOrderId() {
		return orderId;
	}

	public void setOrderId(List<Integer> orderId) {
		this.orderId = orderId;
	}
	
}
