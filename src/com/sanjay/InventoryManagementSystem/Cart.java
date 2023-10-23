package com.sanjay.InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	Map<Integer, Integer>productCategoryIdVsCountMap;
	public Cart() {
		productCategoryIdVsCountMap = new HashMap<>();
	}
	public void addItem(int productId,int count) {
		productCategoryIdVsCountMap.put(productId, productCategoryIdVsCountMap.getOrDefault(productId,0)+count);
	}
	
	public void removeItemFromCart(int productId,int count) {
		if(productCategoryIdVsCountMap.containsKey(productId)) {
			int fr = productCategoryIdVsCountMap.get(productId);
			if(fr-count<=0) {
				productCategoryIdVsCountMap.remove(productId);
			}else {
				productCategoryIdVsCountMap.put(productId, fr-count);
			}
		}
	}
	
	public void emptyCard() {
		productCategoryIdVsCountMap = new HashMap<>();
	}
	
	public Map<Integer, Integer> getCartItems(){
		return productCategoryIdVsCountMap;
	}
}
