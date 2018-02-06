package com.techlabs.basic;

public class TestPassByValue {
	public static void main(String[] args) {
		int mark = 100;
		changeMarkToZero(mark);
		System.out.println(mark);
		int[] marks = { 10, 20, 30 };
		System.out.println(marks);
		changeMarkToZero(marks);
		for (int position = 0; position < marks.length; position++) {
			System.out.println(marks[position]);
		}

	}

	private static void changeMarkToZero(int digit) {
		digit = 0;

	}

	private static void changeMarkToZero(int[] digits) {
		System.out.println("inside the function");

		for (int position = 0; position < digits.length; position++) {
			digits[position] = 0;

		}
		System.out.println(digits);
		System.out.println("End of the function");
	}

}
