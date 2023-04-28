package com.greatlearning;

// main outside the class
class Student {
	int id;
	String name;
}

public class Student1 {
	public static void main(String args[]) {
		// 'new' keyword is for "dynamic memory allocation"
		Student s1 = new Student();
		System.out.println(s1.id); // 0
		System.out.println(s1.name); // null

		// As value not assigned, we get default values
	}
}
