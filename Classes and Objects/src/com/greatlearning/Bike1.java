package com.greatlearning;

public class Bike1 {
	
	// default constructor
	Bike1(){
		System.out.println("Bike1 is created");
	}

	public static void main(String args[]) {
		// calling a default constructor
		Bike1 bike = new Bike1();
		System.out.println(bike);	// gives the identityHashmap of the object ('address' in other languages)
	}
}
