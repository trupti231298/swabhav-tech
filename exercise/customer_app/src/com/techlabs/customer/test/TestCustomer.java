package com.techlabs.customer.test;

import com.techlabs.customer.Customer;

public class TestCustomer {

	public static void main(String args[]) {

		TestCustomer t1 = new TestCustomer();

		Customer c1 = new Customer(101, "Trupti", 5);
		System.out.println(c1.getInstanceCount());
		System.out.println(Customer.getHeadCount());
		
		Customer c2 = new Customer(102, "Bhavesh", 2);

		System.out.println(c2.getInstanceCount());
		System.out.println(Customer.getHeadCount());
	}

}
