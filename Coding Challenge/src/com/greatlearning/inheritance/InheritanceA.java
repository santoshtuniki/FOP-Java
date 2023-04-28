package com.greatlearning.inheritance;

public class InheritanceA {

	final float pi = 22 / 7;
	float radius, area;

	public void circleArea(float radius) {
		this.radius = radius;
		area = pi * radius * radius;
		System.out.println("Area of circle is: " + area);
	}
}
