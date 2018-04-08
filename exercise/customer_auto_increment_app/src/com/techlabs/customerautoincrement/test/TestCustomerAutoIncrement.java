package com.techlabs.customerautoincrement.test;

import com.techlabs.customerautoincrement.CustomerAutoIncrement;

public class TestCustomerAutoIncrement {
	public static void main(String args[]) {
		CustomerAutoIncrement c1 = new CustomerAutoIncrement("ABC", 5);
		System.out.println(c1.getId());
		System.out.println(c1.getId());
		CustomerAutoIncrement c2 = new CustomerAutoIncrement("XYZ", 2);
		System.out.println(c2.getId());
		System.out.println(c2.getId());
		System.out.println(c1.getId());
		
		

	}
}