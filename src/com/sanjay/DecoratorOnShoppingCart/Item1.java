package com.sanjay.DecoratorOnShoppingCart;

public class Item1 extends Product {
	
	public Item1(String name,Double price,ProductType p) {
		super(name,price,p);
	}
	
	@Override
	public double getPrice() {
		return originalePrice;
	}

}
