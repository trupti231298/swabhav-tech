package com.techlabs.student;

public class Student {
	private String name;
	private int age;
	private float cgpa;
	private float height;
	private float weight;
	private Gender gender;
	static int count = 0;

	public Student(String name, int age, float cgpa, float height, float weight, Gender gender) {
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		count++;

	}

	public float convertToPercentage() {
		float percentage = this.cgpa * (9 / 5);
		return percentage;
	}

	public float calculateBMI() {
		float BMI = (this.weight / this.height) / this.height;
		return BMI;

	}

	public String getBMIStatus() {
		if (calculateBMI() < 18.5) {
			return "underweight";
		} else if (calculateBMI() > 18.5 && calculateBMI() < 24.5) {
			return "normal weight";
		} else if (calculateBMI() > 25 && calculateBMI() < 29.5) {
			return "overweight";
		} else {
			return "obese";
		}

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public float getCGPA() {
		return this.cgpa;
	}

	public float getHeight() {
		return this.height;
	}

	public float getWeight() {
		return this.weight;
	}

	public Gender getGender() {
		return this.gender;
	}

	public int howManyStudentsThere() {
		return count;
	}

	public static int getHeadCount() {
		return count;
	}

}
