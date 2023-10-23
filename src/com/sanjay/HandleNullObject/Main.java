package com.sanjay.HandleNullObject;

public class Main {

	public static void main(String[] args) {
		Vehicle bike = VehicleFactory.getVehicleObj("Car");
		System.out.println("TankCapacity:"+bike.getTankCapacity());
	}

}
