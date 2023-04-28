package com.greatlearning.static_final;

public class Area {

	final float pi = 22 / 7;
	float radius;

	Area() {
		radius = 0;
	}

	Area(float r) {
		radius = r;
	}

	public float cal_area() {
		return pi * radius * radius;
	}

	public static void main(String[] args) {

		Area a1 = new Area();
		Area a2 = new Area(2.5f);

		System.out.println("Area of Circle1 is: " + a1.cal_area());
		System.out.println("Area of Circle2 is: " + a2.cal_area());
	}

}
