package com.xworkz.inheritance.device;

public class Headset {

	private String brand;
	private Type type;
	private Float battery;
	private Float warranty;

	public enum Type {
		BLUETOOTH, WIRED;
	}

	public Headset(String brand, Type type, Float battery, Float warranty) {
		super();
		this.brand = brand;
		this.type = type;
		this.battery = battery;
		this.warranty = warranty;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode");
		return super.hashCode();
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString");
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals");
		if (obj != null) {
			System.out.println("Good Human you have knowledge on java");
		}
		if (obj instanceof Headset) {
			Headset casted = (Headset) obj;
			String castedBrand = casted.getBrand();
			Float castedWarranty = casted.getWarranty();

			if (this.brand.equals(castedBrand) && this.warranty.equals(castedWarranty)) {
				System.out.println("Matching Brand and warranty");
				return true;
			}

			else {
				System.out.println("No match found for Brand and warranty");
			}
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Float getBattery() {
		return battery;
	}

	public void setBattery(Float battery) {
		this.battery = battery;
	}

	public Float getWarranty() {
		return warranty;
	}

	public void setWarranty(Float warranty) {
		this.warranty = warranty;
	}
}
