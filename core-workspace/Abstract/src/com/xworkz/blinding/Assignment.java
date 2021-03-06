package com.xworkz.blinding;

/*abstract means incomplete
 * can not able to instantiate
 * can inherit through sub-class
 * if "method" is declared as "Abstract" --> class should also be declared as "Abstract"
 */
public abstract class Assignment {// The type Assignment must be an abstract class to define abstract methods

	private String day;

	public Assignment() {
		System.out.println("Invoked no-arg Assignment");
	}
	public Assignment(String day) {
		System.out.println("Invoked Assignment");
		this.day = day;
		System.out.println(this.day);
	}

	public void doneTask() {
		System.out.println("Invoked doneTask");
		System.out.println("day is : ".concat(day));
	}

	public static void dtoTask() {
		System.out.println("Invoked dtoTask");
	}

	// The abstract method cloneTask in type Assignment can only set a visibility
	// modifier, one of public or protected
	public  abstract void cloneTask();

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
