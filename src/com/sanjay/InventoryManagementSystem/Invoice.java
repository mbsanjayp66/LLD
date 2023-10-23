package com.sanjay.InventoryManagementSystem;

public class Invoice {
	int totalItemPrice;
	int totalTax;
	int totalFinalPrice;
	
	
	public void generateInvoice() {
		totalFinalPrice = 200;
		totalItemPrice = 100;
		totalTax = 20;
	}
}
