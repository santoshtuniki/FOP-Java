package com.greatlearning;

class Perimeter{
	int length;
	int breadth;
	
	// Default Constructor
	Perimeter(){
		length = 0;
		breadth = 0;
	}
	
	// Parameterized Constructor
	Perimeter(int l, int b){
		length = l;
		breadth = b;
	}
	
	void cal_perimeter() {
		int perimeter;
		perimeter = 2 * ( length + breadth );
		System.out.println("Perimeter of rectangle is: " + perimeter);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Perimeter p1 = new Perimeter();
		Perimeter p2 = new Perimeter(25, 100);
		
		p1.cal_perimeter();
		p2.cal_perimeter();
	}

}
