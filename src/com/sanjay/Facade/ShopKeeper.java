package com.sanjay.Facade;

public class ShopKeeper {
	MobileShop iphone;
	MobileShop samsung;
	MobileShop redmi;
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		redmi = new Redmi();
	}
	public void iphoneSale(){
		iphone.modelNumber();
		iphone.price();
	}
	
}
