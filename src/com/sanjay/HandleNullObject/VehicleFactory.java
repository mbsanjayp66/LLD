package com.sanjay.HandleNullObject;

public class VehicleFactory {
    static Vehicle getVehicleObj(String obj) {
		if(obj.equals("Car")) {
			return new Car();
		}
		return new NullObj();
	}
}
