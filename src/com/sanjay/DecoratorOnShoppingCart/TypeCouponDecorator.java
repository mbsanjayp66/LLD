package com.sanjay.DecoratorOnShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends Product {
	Product product;
	int discountPerc;
	ProductType productType;
	static List<ProductType>eligibleTypes = new ArrayList<>();
	static{
		eligibleTypes.add(ProductType.DECORATIVE);
		eligibleTypes.add(ProductType.FURNITURE);
	}
	
	public TypeCouponDecorator(Product product, int discountPerc, ProductType productType) {
		this.product = product;
		this.discountPerc = discountPerc;
		this.productType = productType;
	}



	@Override
	public double getPrice() {
		Double price = product.getPrice();
		if(eligibleTypes.contains(product.getType())) {
			return price*(1-(discountPerc*1.0/100));
		}
		return price;
	}

}
