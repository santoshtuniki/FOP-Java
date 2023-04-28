package com.greatlearning.constructor;

public class ThreeDimensionShape {

	double height, width, depth;

	ThreeDimensionShape() {
		height = width = depth = 0;
	}

	ThreeDimensionShape(double h) {
		height = width = depth = h;
	}

	ThreeDimensionShape(double h, double w, double d) {
		height = h;
		width = w;
		depth = d;
	}

	public double volume() {
		return height * width * depth;
	}

	public static void main(String[] args) {
		// create boxes using the various

		// constructors
		ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);

		ThreeDimensionShape shape2 = new ThreeDimensionShape();

		ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

		double volume;

		volume = shape1.volume();
		System.out.println("Volume of shape1: " + volume);

		volume = shape2.volume();
		System.out.println("Volume of shape2: " + volume);

		volume = shape3.volume();
		System.out.println("Volume of shape3: " + volume);
	}

}
