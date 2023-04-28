package com.greatlearning;

public class Static {
	
	static int count = 10;
//	static int i = 5;
	
	public static void main(String[] args) {
		while(count-->0) 
				checkStatic();	
	}

	public static void checkStatic() {
		int i = 5;
		i++;
		System.out.print(" " + i);
		System.out.println(" " + count);
	}
}