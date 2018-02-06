package com.techlabs.basic;

public class TestDigits {
	public static void main(String args[]) {
		printNoOfDigitIn(34323);
		boolean result = isNumberPallindrome(343);
		System.out.println(result);
	}

	private static void printNoOfDigitIn(int number) {
		int digit = 0;
		while (number != 0) {
			number = number / 10;
			digit++;
		}
		System.out.println(digit);
	}

	private static boolean isNumberPallindrome(int number) {
		int remainder;
		int originalnumber = number;
		int sum = 0;
		while (number != 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (originalnumber == sum) {
			return true;
		}
		return false;
	}
}