package com.sanjay.DecoratorOnShoppingCart;

public class PercentageCouponDecorator extends CouponDecorator {
	Product product;
	int discountPerc;
	
	public PercentageCouponDecorator(Product product, int discountPerc) {
		this.product = product;
		this.discountPerc = discountPerc;
	}
	
	@Override
	public double getPrice() {
		Double price = product.getPrice();
		return price*(1-(discountPerc*1.0/100));
	}

}
