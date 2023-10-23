package com.sanjay.InventoryManagementSystem;

import java.util.List;

public class NearestWareHouseSelectionStrategy extends WareHouseSelectionStrategy {

	@Override
	public WareHouse selectWareHouse(List<WareHouse> wareHousesList) {
		return wareHousesList.get(0);
	}

}
