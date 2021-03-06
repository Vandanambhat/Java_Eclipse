package com.xworkz.inheritance.device;

import com.xworkz.inheritance.device.Watch.Type;

public class WatchStarter {

	public static void main(String[] args) {

		Watch watchTime = new Watch("SONATA", Type.DIGITAL, 300f);
		System.out.println(watchTime);
		System.out.println(watchTime.toString());
		System.out.println(watchTime.hashCode());
		System.out.println(System.identityHashCode(watchTime));
		System.out.println("-----------------------");
		Watch watchTime1 = new Watch("ROLEX", Type.ANALOG, 4000f);
		System.out.println(watchTime1);
		System.out.println(watchTime1.toString());
		System.out.println(watchTime1.hashCode());
		System.out.println(System.identityHashCode(watchTime1));
		System.out.println("-----------------------");
		watchTime.setBrand("RoadStar");
		watchTime.setPrice(4000f);

		watchTime1.setBrand("FASTRACK");
		watchTime1.setPrice(2500f);

		watchTime.equals(watchTime1);

		System.out.println("-----------------------");

		watchTime.setBrand("RoadStar");
		watchTime.setPrice(4000f);

		watchTime1.setBrand("RoadStar");
		watchTime1.setPrice(4000f);

		watchTime.equals(watchTime);
	}

}
