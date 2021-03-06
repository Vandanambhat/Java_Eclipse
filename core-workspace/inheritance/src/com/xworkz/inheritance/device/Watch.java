package com.xworkz.inheritance.device;

public class Watch {

	private String brand;
	private Type watchType;
	private Float price;

	public Watch(String brand, Type watchType, Float price) {
		super();
		this.brand = brand;
		this.watchType = watchType;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getWatchType() {
		return watchType;
	}

	public void setWatchType(Type watchType) {
		this.watchType = watchType;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	enum Type {
		ANALOG, DIGITAL;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals");
		if (obj != null) {
			System.out.println("Good Human you have knowledge on java");
		}
		if (obj instanceof Watch) {
			Watch castedWatch = (Watch) obj;
			String casteBrand = castedWatch.getBrand();
			Float castePrice = castedWatch.getPrice();

			if ((this.brand.equals(casteBrand)) && (this.price.equals(castePrice))) {
				System.out.println("The watch is same");
				return true;
			} else {
				System.err.println("Watch is not same");
			}

		} else {
			System.out.println("Hey why are you passing NULL, Stupid");
		}
		return false;
	}

}
