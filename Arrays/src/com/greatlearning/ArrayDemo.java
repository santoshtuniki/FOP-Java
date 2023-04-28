package com.greatlearning;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array can be craeted in 2 ways
		
		// Assigning data at the time of initialization
		int[] arr1 = { 10, 20, 30, 40, 50 };
		System.out.println("arr1: ");
		// forEach => for(int x: arr1){...}
		for(int x: arr1) {
			System.out.print(x + " ");
		}
		
		// Initialize array first, then assign the values
		int[] arr2 = new int[5]; // specifying size of the array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("arr2: ");
		for(int y: arr2) {
			System.out.print(y + " ");
		}
	}

}
