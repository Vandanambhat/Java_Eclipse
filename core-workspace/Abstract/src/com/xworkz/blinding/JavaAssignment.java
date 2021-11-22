package com.xworkz.blinding;

public class JavaAssignment extends Assignment {
	// The type JavaAssignment must implement the inherited abstract method
	// Assignment.cloneTask()
	private Integer noOfAssignment;

	public JavaAssignment() {
		// TODO Auto-generated constructor stub
	}
	
	public JavaAssignment(Integer noOfAssignment) {
		this.noOfAssignment=noOfAssignment;
	}

	public JavaAssignment(String day) {
		super("mon");
		System.out.println("Invoked JavaAssignment");
		System.out.println(day);

	}

	@Override
	public void cloneTask() {
		System.out.println("invoked @Override cloneTask");
	}

	public static void dtoTask() {
		System.out.println("Invoked DTO Task");
	}
}
