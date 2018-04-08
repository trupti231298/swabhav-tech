package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
		this.age = 30;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public Player whoIsElder(Player second) {
		if (this.getAge() > second.getAge()) {
			return this;
		}
		return second;

	}

	@Override

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
