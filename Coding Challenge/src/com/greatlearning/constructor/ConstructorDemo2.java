package com.greatlearning.constructor;

public class ConstructorDemo2 {

	public ConstructorDemo2() {
		System.out.println("I am default constructor.");
	}

	public ConstructorDemo2(int a, float f, String s, char c) {
		System.out.println("I am Parameterized constructor. I take various arguments as input.");
		System.out.println("The square of an Integer numberis: " + a * a);
		System.out.println("The square of a float numberis: " + f * f);
		System.out.println("The string you inputted is:" + s);
		System.out.println("The inputted character is: " + c);
	}

	public void observations() {
		System.out.println("inside Observations method");
	}

	public static void main(String[] args) {
		ConstructorDemo2 obj = new ConstructorDemo2();
		ConstructorDemo2 obj1 = new ConstructorDemo2(5, 0.5f, "hello guys", 's');

		obj.observations();
		obj1.observations();
	}
}
