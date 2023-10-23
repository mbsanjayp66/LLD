package com.sanjay.InventoryManagementSystem;

import java.util.List;

public abstract class WareHouseSelectionStrategy {
	public abstract WareHouse selectWareHouse(List<WareHouse>wareHousesList);
}
