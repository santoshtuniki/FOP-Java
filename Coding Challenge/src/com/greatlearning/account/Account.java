package com.greatlearning.account;

public class Account {

	public String customerName;
	public int accountNo;

	Account(String a, int b) {
		customerName = a;
		accountNo = b;
	}

	public void display() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account Number: " + accountNo);
	}

}
