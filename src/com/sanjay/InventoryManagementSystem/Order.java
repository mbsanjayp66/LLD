package com.sanjay.InventoryManagementSystem;

import java.util.Map;

public class Order {
	User user;
	Address deliveryAddress;
	Map<Integer, Integer>productCategoryAndCountMap;
	WareHouse wareHouse;
	Invoice invoice;
	Payment payment;
	OrderStatus orderStatus;
	public Order(User user, WareHouse wareHouse) {
		this.user = user;
		this.wareHouse = wareHouse;
		
	}
	
}
