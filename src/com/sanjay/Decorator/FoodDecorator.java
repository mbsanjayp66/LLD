package com.sanjay.Decorator;

public abstract class FoodDecorator implements Food {
	Food newFood;
	

	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}
	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}
	
	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}

}
