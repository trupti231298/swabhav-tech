package com.techlabs.basic;

public class TestArray2 {
	public static void main(String args[]) {
		int numbers[] = { 10, 20, 30, 40, 41 };
		// int x,y;
		displayArraysize(numbers);
		displayArrayContents(numbers);
		displayEvendigits(numbers);
		display(numbers);
	}

	public static void displayArraysize(int numbers[]) {
		System.out.println("size:" + numbers.length);
	}

	public static void displayArrayContents(int numbers[]) {
		System.out.println("The no.s are:");
		for (int position = 0; position < numbers.length; position++) {
			System.out.print(numbers[position]);

			if (position < numbers.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("");
	}

	public static void displayEvendigits(int numbers[]) {
		int count = 0;
		System.out.println("The no. of even digits are:");
		for (int position = 0; position < numbers.length; position++) {
			if (numbers[position] % 2 == 0) {
				count++;

			}

		}
		System.out.println(count);
	}

	public static void display(int numbers[]) {
		int count = 0;
		System.out.println("The no. of odd digits are:");
		for (int position = 0; position < numbers.length; position++) {
			if (numbers[position] % 2 != 0) {
				count++;

			}

		}
		System.out.println(count);
	}
}
