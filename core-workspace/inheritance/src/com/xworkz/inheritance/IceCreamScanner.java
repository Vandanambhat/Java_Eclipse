package com.xworkz.inheritance;

import com.xworkz.inheritance.device.IceCream;
import com.xworkz.inheritance.device.IceCream.IceCreamFlavour;
import com.xworkz.inheritance.device.IceCream.IceCreamType;

public class IceCreamScanner {

	public static void main(String[] args) {

				IceCream iceCream1 = new IceCream("Old Bombay", IceCreamFlavour.BUTTERSCOTCH, IceCreamType.CUP);
				IceCream iceCream2 = new IceCream(" Amul", IceCreamFlavour.CHOCOLATE, IceCreamType.CONE);
				IceCream iceCream3 = new IceCream("Old Bombay", IceCreamFlavour.BUTTERSCOTCH, IceCreamType.CUP);

				System.out.println(iceCream1.toString());
				System.out.println(iceCream1.hashCode());

				System.out.println(iceCream2.toString());
				System.out.println(iceCream2.hashCode());

				System.out.println(iceCream3.toString());
				System.out.println(iceCream3.hashCode());
				
				System.out.println(iceCream1.equals(iceCream2)+"\n");
				System.out.println(iceCream1.equals(iceCream3)+"\n");
				System.out.println(iceCream1.equals(null)+"\n");
				System.out.println(iceCream1.equals("Anode")+"\n");

			}

		}
