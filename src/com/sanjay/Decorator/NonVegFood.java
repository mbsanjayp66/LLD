package com.sanjay.Decorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		
		return super.prepareFood()+"with chicken";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice()+500.0;
	}
	


}
