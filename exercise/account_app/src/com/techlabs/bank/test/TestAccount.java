package com.techlabs.bank.test;

import com.techlabs.bank.Account;
import com.techlabs.bank.StatusOption;

public class TestAccount {
	public static void main(String args[]) {
		Account a1 = new Account("1A2B23F", "Trupti", 1000, StatusOption.ACTIVE);
		printDetails(a1);
		System.out.println("Amount after withdrawal:");
		a1.withdraw(501);
		// System.out.println("Amount after deposition:");
		// a1.deposit(1000);
		printDetails(a1);
		

	}

	public static void printDetails(Account a) {
		System.out.println("Account no:" + a.getAccountNo());
		System.out.println("Name:" + a.getName());
		System.out.println("Balance:" + a.getBalance());
		System.out.println("Account Status:" + a.getStatus());

	}

}
