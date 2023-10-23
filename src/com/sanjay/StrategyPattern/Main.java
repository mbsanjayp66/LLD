package com.sanjay.StrategyPattern;

public class Main {

	public static void main(String[] args) {
		Context context = new Context(new Sub());
		context.calculate(22, 2);
		System.out.println(context.calculate(22, 2));
	}

}
