package com.techlabs.customerautoincrement;

public class CustomerAutoIncrement {
	private int id ;
	private String name;
	private int orders;
	private static int autoIncrementCount = 1000;

	public CustomerAutoIncrement(String name, int orders) {
		this.name = name;
		this.orders = orders;
		autoIncrementCount++;
		id=autoIncrementCount;

	}

	public int getId() {

		
		return id;

	}
}