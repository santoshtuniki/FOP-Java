package com.greatlearning;

public class Bike2 {
	
	Bike2(){
		System.out.println("Bike1 is created");
	}

	public static void main(String args[]) {
		// calling a default constructor
		Bike2 bike;		// No error but pointing to 'null'
//		System.out.println(bike);
	}
}
/*
	(on executing line-12)
	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The local variable bike may not have been initialized
		
	i.e, object created but not initialized
*/
