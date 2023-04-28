package com.greatlearning.binary;

public class BinaryOperator {
	
	public int val = 10, output;

	public int performLeftShift() {
		output = val << 1;
		return output;
	}
	
	public void performRightShift(int val, int digitstoshift) {
		this.val = val;
		output = val >> digitstoshift;
		System.out.println("value after shift: " + output);;
	}
	
	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		System.out.println("Left shift of the number " + obj.val + " is: " +obj.performLeftShift());
		obj.performRightShift(45, 2);
	}

}
