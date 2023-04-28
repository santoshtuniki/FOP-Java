package com.greatlearning;

class A {
	private int data = 40;

	private void msg() {
		System.out.println(data);
		System.out.println("Hello Java");
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
//		A obj = new A();
//		System.out.println(obj.data);
//		obj.msg();
	}

}
//since access modifier is private, data cannot be accessed
/*
	Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
		The field A.data is not visible
		The method msg() from the type A is not visible
*/