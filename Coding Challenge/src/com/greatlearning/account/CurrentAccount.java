package com.greatlearning.account;

public class CurrentAccount extends Account {

	public int currentBalance;

	CurrentAccount(String a, int b, int c) {
		super(a, b);
		currentBalance = c;
	}

	public void display() {
		super.display();
		System.out.println("Current Balance: " + currentBalance);
	}

}