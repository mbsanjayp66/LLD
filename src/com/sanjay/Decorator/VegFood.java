package com.sanjay.Decorator;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "Veg food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}

}
