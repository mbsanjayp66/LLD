package com.sanjay.StrategyPattern;

public class Mul implements Strategy {

	@Override
	public int cal(int a, int b) {
		return a*b;
	}

}
