package com.xworkz.inheritance.device;

import com.xworkz.inheritance.device.Plant.Type;

public class PlantScammer {

	public static void main(String[] args) {

		Plant plant=new Plant("Cotton", false, 1, Type.SHORT);
//		Plant plant1=new Plant("PAPAYA", true, 10, Type.MEDIUM);
		Plant plant2=new Plant("Cotton", false, 1, Type.SHORT);
		
		plant.equals(plant2);
	}

}
