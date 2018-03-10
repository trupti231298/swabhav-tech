package com.techlabs.human;

public class Human {
	private String name;
	private int age;
	private GenderOption gender;
	private float weight;
	private float height;

	public Human(String pname, int page, GenderOption pgender, float pweight, float pheight) {
		name = pname;
		age = page;
		gender = pgender;
		weight = pweight;
		height = pheight;
	}

	public Human(String pname, int page, GenderOption pgender) {
		name = pname;
		age = page;
		gender = pgender;
		weight = 5;
		height = 50;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderOption getGender() {
		return gender;
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}

	public void play() {
		height = height + 1;
		System.out.println("height:" + height);
		weight = weight + 1;
		System.out.println("weight:" + weight);

	}

}
