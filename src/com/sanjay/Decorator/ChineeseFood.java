package com.sanjay.Decorator;

public class ChineeseFood extends FoodDecorator {

	public ChineeseFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood()+"Chinese";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice()+100.0;
	}

}
