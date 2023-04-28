package com.greatlearning.corejava;

public class Customer {

	public String fullName;
	public int age;

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.fullName = "Santosh Tuniki";
		customer.age = 22;

		System.out.println(customer.fullName);
		System.out.println(customer.age);
	}
}
