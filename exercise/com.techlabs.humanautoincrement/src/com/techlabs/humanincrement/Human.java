package com.techlabs.humanincrement;

public class Human {

	private String name;
	private int age;
	private int id;
	static int count = 1000;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		count = count + 1;
		id = count;
	}

	public int getId() {

		return id;
	}

}
