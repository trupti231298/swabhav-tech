package com.techlabs.customer;

public class Customer {
	private int id;
	private String name;
	private int ordersPlaced;
	private static int count = 0;

	public Customer(int id, String name, int ordersPlaced) {
		this.id = id;
		this.name = name;
		this.ordersPlaced = ordersPlaced;
		count++;

	}

	public int getInstanceCount() {
		return count;
	}

	public static int getHeadCount() {
		return count;
	}
}
