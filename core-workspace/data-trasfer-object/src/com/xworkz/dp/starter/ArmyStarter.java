package com.xworkz.dp.starter;

import com.xworkz.dp.dto.ArmyDTO;

public class ArmyStarter {

	public static void main(String[] args) {

		// giving values using the getter and setter method
		ArmyDTO armyDTO = new ArmyDTO();
		armyDTO.setCountry("India");
		armyDTO.setNoOfSoldiers(300000);
		armyDTO.setNoOfTankers(1);
		armyDTO.setNoOfCarriers(20);
		armyDTO.setMajor("Rakesh");

		// giving values using parameterized constructor
		ArmyDTO armyDTO1 = new ArmyDTO("Spain", 100400, 0, 0, "Ayyappa");
		ArmyDTO armyDTO2 = new ArmyDTO("Israil", 34000, 2, 15, "ANMOL");
		ArmyDTO armyDTO3 = new ArmyDTO("China", 320000, 1, 13, "Jee Chang Wook");
		ArmyDTO armyDTO4 = new ArmyDTO("US", 290000, 0, 16, "Tony Stark");

		// array declaration and initialization
		ArmyDTO[] ref = new ArmyDTO[6];
		ref[0] = armyDTO;
		ref[1] = armyDTO1;
		ref[2] = armyDTO3;
		ref[3] = armyDTO4;
		ref[4] = armyDTO2;
		// iterations for printing the array values
		for (int pataki = 0; pataki < ref.length; pataki++) {

			// System.out.println(ref[pataki]);prints the null values for ArmyDTO[] ref =
			// new ArmyDTO[6];

			ArmyDTO newRef = ref[pataki];
			if (newRef != null) {
				System.out.println(newRef.getCountry());
				System.out.println(newRef.getNoOfSoldiers());
				System.out.println(newRef.getNoOfCarriers());
				System.out.println(newRef.getNoOfTankers());
				System.out.println(newRef.getMajor());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

	}

}
