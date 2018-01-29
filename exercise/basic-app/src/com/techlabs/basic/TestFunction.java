package com.techlabs.basic;

public class TestFunction {
	public static void main(String args[]) {
		showHeader();
		printEvenNos(50);
		showFooter();
	}

	private static void showHeader() {
		System.out.println("------SWABHAV TECHLABS---");
	}

	private static void showFooter() {
		System.out.println("-----copyright@2018----");
	}

	public static void printEvenNos(int limit) {
		for (int number = 0; number <=limit; number++) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
