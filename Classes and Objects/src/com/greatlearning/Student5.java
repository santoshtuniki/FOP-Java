package com.greatlearning;

// we can also create multiple objects and store information in it through reference variable
class Student4 {
	int id;
	String name;
}

public class Student5 {

	public static void main(String[] args) {
		// Creating objects
		Student4 s3 = new Student4();
		Student4 s4 = new Student4();

		// Initiallizing objects
		s3.id = 1592;
		s3.name = "Santosh";

		s4.id = 1601;
		s4.name = "Vikas";

		// Printing data
		System.out.println(s3.id + " " + s3.name);
		System.out.println(s4.id + " " + s4.name);
	}

}
