package com.greatlearning;

import java.util.ArrayList;

// User-defined class
class Student {
	String name;
	int fee;
	int id;

	// Constructor
	Student(String name, int fee, int id) {
		this.name = name;
		this.fee = fee;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", fee=" + fee + ", id=" + id + "]";
	}

}

public class UserDefinedClassDemo {

	public static void main(String[] args) {

		// ArrayList will contain a collection of Customer's objects
		ArrayList<Student> arr = new ArrayList<>();

		// Creating Customer objects.
		Student student1 = new Student("Jack", 1000, 2);
		Student student2 = new Student("Shiny", 7000, 3);
		Student student3 = new Student("Riyaz", 5000, 1);
		Student student4 = new Student("Tinesh", 3000, 6);
		Student student5 = new Student("Maria", 6000, 4);
		
		//Storing objects in an ArrayList collection class
		arr.add(student1);
		arr.add(student2);
		arr.add(student3);
		arr.add(student4);
		arr.add(student5);
		
//		System.out.println("ArrayList: " + arr);
		
		for(Student student: arr) {
			System.out.println(student);
		}
	}

}
