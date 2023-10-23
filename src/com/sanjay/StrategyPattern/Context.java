package com.sanjay.StrategyPattern;

public class Context {
	Strategy strategy;
	public Context(Strategy s) {
		this.strategy = s;
	}
	public int calculate(int a,int b){
		return strategy.cal(a, b);
	}
}
