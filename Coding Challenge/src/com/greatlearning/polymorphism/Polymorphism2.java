package com.greatlearning.polymorphism;

public class Polymorphism2 {

	public float area;

	public void findArea(float length, float breadth) {
		area = length * breadth;
		System.out.println("Area of rectangle: " + area);
	}

	public void findArea(float length, float breadth, float depth) {
		area = 2 * (length * breadth + breadth * depth + depth * length);
		System.out.println("Area of rectangular cuboid: " + area);
	}

	public static void main(String[] args) {
		Polymorphism2 obj = new Polymorphism2();
		
		// Method Overloading
		obj.findArea(3.5f, 4f);
		obj.findArea(3f, 4f, 5f);
	}

}