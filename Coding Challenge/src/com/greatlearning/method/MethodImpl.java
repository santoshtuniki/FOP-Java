package com.greatlearning.method;

public class MethodImpl {

	public String s = null;

	public void RedHouse() {
		// methods without return type
		System.out.println("I am from method without returntype");
	}

	public void RedHouse(String s) {
		// method without return type and an input argument
		this.s = s;
		System.out.println(s);
	}

	public String RedHouse1() {
		// methods with return type
		s = "I am from method with return type";
		return s;
	}

	public String RedHouse1(String s) {
		// method with return type and input argument
		this.s = s;
		return s;
	}

	public static void main(String[] args) {
		MethodImpl obj = new MethodImpl();
		
		obj.RedHouse();
		obj.RedHouse("I am from method without return typeand an input argument");
		
		System.out.println(obj.RedHouse1());
		System.out.println(obj.RedHouse1("I am from methodwith return type and aninput argument"));
	}
}
