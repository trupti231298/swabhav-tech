package com.techlabs.rectangle.test;

public class ChangeNos {
	public static void main(String[] args) {
		int nos[] = { 10, 20, 30, 40, 50 };
		change(nos);
		for (int i = 0; i < nos.length; i++) {
			System.out.println(nos[i]);
		}
		System.out.println(nos.hashCode());

	}

	public static void change(int[] num) {
		int number = 60;
		for (int i = 0; i < num.length; i++) {

			num[i] = number;
			number += 10;
		}
		System.out.println(num.hashCode());
	}

}
