package com.greatlearning.inheritance;

public class InheritanceB extends InheritanceA {

	float length, breadth, area;

	public void rectangleArea(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
		area = length * breadth;
		System.out.println("Area of rectangle is: " + area);
	}
}