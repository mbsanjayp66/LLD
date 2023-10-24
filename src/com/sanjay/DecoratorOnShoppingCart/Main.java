package com.sanjay.DecoratorOnShoppingCart;

public class Main {

	public static void main(String[] args) {
		Product item1 = new Item1("Fan", 1000.0, ProductType.ELECTRONIC);
		Product item2 = new Item1("Sofa", 20000.0, ProductType.FURNITURE);
		ShoppingCart s1 = new ShoppingCart();
		s1.addToCart(item1);
		s1.addToCart(item2);
		System.out.println("Total Price of Items: "+s1.getPrice());
	}

}
