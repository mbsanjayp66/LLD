package com.sanjay.Decorator;

public class Demo {

	public static void main(String[] args) {
		Food f1  = new NonVegFood(new ChineeseFood(new VegFood())); 
		System.out.println(f1.prepareFood());
		System.out.println(f1.foodPrice());
	}

}
