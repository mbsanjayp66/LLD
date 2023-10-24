package com.sanjay.MediatorDesignPattern;

public class Bidder implements Colleague {
	String name;
	AuctionMediator auctionMediator;
	
	public Bidder(String name, AuctionMediator auctionMediator) {
		this.name = name;
		this.auctionMediator = auctionMediator;
		this.auctionMediator.addBidder(this);
	}

	@Override
	public void placeBid(int bidAmount) {
		auctionMediator.placeBid(this,bidAmount);
	}

	@Override
	public void receiveBidNotification(int amount) {
		System.out.println("SomeOne has Put the higher bid :"+amount);
	}

	@Override
	public String getName() {
		return name;
	}

}
