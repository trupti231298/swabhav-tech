package com.techlabs.human.test;

import com.techlabs.human.Human;
import com.techlabs.human.GenderOption;

public class TestHuman {
	public static void main(String args[]) {
		Human h1 = new Human("Trupti", 19, GenderOption.FEMALE, 65f, 165f);
		Human h2 = new Human("Tom", 20, GenderOption.MALE);

		System.out.println("Details of first person:");
		printDetails(h1);

		System.out.println("");

		System.out.println("Details of second person:");
		printDetails(h2);
	}

	public static void printDetails(Human h) {
		System.out.println("Name:" + h.getName());
		System.out.println("Age:" + h.getAge());
		System.out.println("Gender:" + h.getGender());
		System.out.println("Weight:" + h.getWeight());
		System.out.println("Height:" + h.getHeight());
		System.out.println("Weight and height after change:");
		h.play();
	}
}
