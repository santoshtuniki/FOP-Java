package com.greatlearning;

public class Counter {
	int count = 0;	// will get memory each time when instantiated
	
	Counter(){
		count++;	// incrementing value
		System.out.println(count);
	}

	public static void main(String[] args) {
		// creating objects
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
	}

}
/*
Without static 
Output:		1
			1
			1
			 
With static 
Output:		1
			2
			3
 */