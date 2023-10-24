package com.sanjay.MediatorDesignPattern;

public interface Colleague {
	void placeBid(int bidAmount);
	void receiveBidNotification(int amount);
	String getName();
}
