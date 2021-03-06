package com.xworkz.inheritance.device;

public class Plant {
	private String name;
	private boolean alive;
	private Integer lifeSpan;
	private Type plantType;

	enum Type {
		SHORT, MEDIUM, LONG;
	}

	public Plant(String name, boolean alive, Integer lifeSpan, Type plantType) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifeSpan = lifeSpan;
		this.plantType = plantType;
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
		if (obj instanceof Plant) {

			Plant casted = (Plant) obj;
			String castedName = casted.getName();
			Integer castedLifeSpan = casted.getLifeSpan();
			if (this.name.equals(castedName) && (this.lifeSpan.equals(castedLifeSpan))) {
				System.out.println("Matched Name and lifeSpan");
			} else {
				System.out.println("No match for NAme and lifeSpan");
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Integer getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(Integer lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public Type getPlantType() {
		return plantType;
	}

	public void setPlantType(Type plantType) {
		this.plantType = plantType;
	}
}
