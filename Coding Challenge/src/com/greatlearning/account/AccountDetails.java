package com.greatlearning.account;

public class AccountDetails extends CurrentAccount {

	public int depositAmount, withdrawalAmount;

	AccountDetails(String a, int b, int c, int d, int e) {
		super(a, b, c);
		depositAmount = d;
		withdrawalAmount = e;
	}

	public void display() {
		super.display();
		System.out.println("Deposit Amount: " + depositAmount);
		System.out.println("Withdrawl Amount: " + withdrawalAmount);
	}

}