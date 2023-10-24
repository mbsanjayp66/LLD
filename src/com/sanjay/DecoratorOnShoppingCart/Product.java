package com.sanjay.DecoratorOnShoppingCart;

public abstract class Product {
	String name;
	Double originalePrice;
	ProductType type;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double price, ProductType type) {
		this.name = name;
		this.originalePrice = price;
		this.type = type;
	}
	
	public abstract double getPrice();
	public ProductType getType() {
		return type;
	}
	
}
