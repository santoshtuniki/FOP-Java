package com.greatlearning;

// Since we use same package, use different 'classNames'
class Student2 {
	int id;
	String name;
}

public class Student3 {
	public static void main(String args[]) {
		Student2 s2 = new Student2();
		// Initiallization through reference
		s2.id = 1592;
		s2.name = "Santosh";

		System.out.println(s2.id + " " + s2.name);
	}
}
