package com.greatlearning;

public class StringDemo {

	public static void main(String[] args) {
		// String() -> Default constructor for empty string
		String str1 = new String();
		System.out.println("String 1: " + str1);
		
		// String(String var) -> Creates a string value given on the heap
		String str2 = new String("Hello Java");
		System.out.println("String 2: " + str2);
		
		// String(char[] arr) -> Creates String objects and stores the array of characters in it
		char[] c = { 'J', 'A', 'V', 'A' };
		String str3 = new String(c);
		System.out.println("String 3: " + str3);
		
		// String(char[] arr, int startIndex, int count) -> Creates and initializes a string object with a subrange of a character array
		char[] chars = { 'w', 'i', 'n', 'd', 'o', 'w', 's' };
		String str4 = new String(chars, 2, 3);
		System.out.println("String 4: " + str4);
	}

}
