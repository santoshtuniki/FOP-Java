package com.greatlearning.constructor;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("Hi learners!. This is Santosh and I am 22 years old.\n" + "I am from Telangana. "
				+ "Happy Learning!!!");
	}

	public ConstructorDemo(String name, int age, String location) {
		System.out.println("\n\nHi Learners!. This is " + name + " and I am " + age + " years old.\n" + "I am from "
				+ location + ". Happy Learning!!!");
	}

	public static void main(String[] args) {
		ConstructorDemo constructorDemo;
		constructorDemo = new ConstructorDemo();
		constructorDemo = new ConstructorDemo("Harshit", 25, " Uttar Pradesh");
	}
}