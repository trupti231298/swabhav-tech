package com.techlabs.bank.test;

import com.techlabs.bank.Account;
import com.techlabs.bank.StatusOption;

public class TestToString {
	public static void main(String args[]) {
		Account acc1 = new Account("101", "ABC", 500, StatusOption.ACTIVE);
		System.out.println(acc1);
		System.out.println(acc1.toString());

	}

}
