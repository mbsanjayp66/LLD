package com.sanjay.InventoryManagementSystem;

import java.util.List;

public class WareHouseController {
	List<WareHouse>wareHouseList;
	WareHouseSelectionStrategy wareHouseSelectionStrategy = null;
	public WareHouseController(List<WareHouse> wareHouseList, WareHouseSelectionStrategy wareHouseSelectionStrategy) {
		this.wareHouseList = wareHouseList;
		this.wareHouseSelectionStrategy = wareHouseSelectionStrategy;
	}
	
	public void add(WareHouse wareHouse) {
		wareHouseList.add(wareHouse);
	}
	
	public void remove(WareHouse wareHouse) {
		wareHouseList.remove(wareHouse);
	}
	
	public WareHouse selectWareHouse(WareHouseSelectionStrategy strategy) {
		this.wareHouseSelectionStrategy = strategy;
		return wareHouseSelectionStrategy.selectWareHouse(wareHouseList);
	}
}
