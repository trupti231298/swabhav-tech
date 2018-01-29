package com.techlabs.basic;

public class TestArray {
	public static void main(String args[]) {
		int numbers[] = { 10, 20, 30, 40 };

		System.out.println("size :" + numbers.length);
		System.out.println("No.s are:");

		for (int position = 0; position < numbers.length; position++) {
			System.out.print(numbers[position]);
			if (position < numbers.length - 1) {
				System.out.print(",");
			}
		}

	}
}
