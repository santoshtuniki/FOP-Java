package com.greatlearning;

// Initiallization through method
class Student6 {
	int id;
	String name;

	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}

	void displayInformation() {
		System.out.println(id + " " + name);
	}
}

public class Student7 {

	public static void main(String[] args) {
		Student6 s6 = new Student6();
		Student6 s7 = new Student6();

		s6.insertRecord(2004, "Bala");
		s7.insertRecord(2014, "Partha");

		s6.displayInformation();
		s7.displayInformation();
	}

}
