package com.sanjay.MediatorDesignPattern;

public class Main {
	public static void main(String[] args) {
		AuctionMediator ac = new Auction();
		Colleague c1 = new Bidder("Sanjay", ac);
		Colleague c2 = new Bidder("Saty", ac);
		c1.placeBid(100);
		c2.placeBid(2000);
	}
}
