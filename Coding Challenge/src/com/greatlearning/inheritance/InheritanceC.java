package com.greatlearning.inheritance;

public class InheritanceC extends InheritanceB {

	float base, height, area;

	public void triangleArea(float base, float height) {
		this.base = base;
		this.height = height;
		area = 0.5f * base * height;
		System.out.println("Area of triangle is: " + area);
	}
}