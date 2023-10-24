package com.sanjay.DecoratorOnShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Product>productList;
	public ShoppingCart() {
		productList = new ArrayList<>();
	}
	
	public void addToCart(Product product) {
		Product productWithDiscount = new TypeCouponDecorator(new PercentageCouponDecorator(product, 10), 20, product.getType());
		productList.add(productWithDiscount);
	}
	
	public double getPrice() {
		double totalPrice = 0;
		for(Product p:productList) {
			totalPrice+=p.getPrice();
		}
		return totalPrice;
	}
}
