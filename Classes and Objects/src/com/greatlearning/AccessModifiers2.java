package com.greatlearning;

class B {
	private int data = 1974;

	public void msg() {
		System.out.println(data);
		System.out.println("Hello Java");
	}
}

public class AccessModifiers2 {

	public static void main(String[] args) {
		B obj = new B();
//		System.out.println(obj.data);
		obj.msg();
	}

}
