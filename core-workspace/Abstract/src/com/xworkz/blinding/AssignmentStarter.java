package com.xworkz.blinding;

import java.lang.reflect.Method;

public class AssignmentStarter {

	public static void main(String[] args) {
		// Cannot instantiate the type Assignment

		Assignment qwerty1 = new JavaAssignment("Monday");
		System.out.println(qwerty1.getDay());

		// displaying no.of methods
		Assignment qwerty = new Assignment("Monday");//Cannot instantiate the type Assignment
		Class claz = qwerty.getClass();

		Method[] method = claz.getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println("methods are" + method[i]);
		}

	}
}
