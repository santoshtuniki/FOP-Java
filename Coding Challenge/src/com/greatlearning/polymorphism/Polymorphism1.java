package com.greatlearning.polymorphism;

class A {
	void car() {
		System.out.println("I am method A");
	}
}

class B extends A {
	void car() {
		System.out.println("I am method B");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		A obj = new A();
		obj.car();

		// Method Overriding
		A obj1 = new B();
		obj1.car();
	}

}
