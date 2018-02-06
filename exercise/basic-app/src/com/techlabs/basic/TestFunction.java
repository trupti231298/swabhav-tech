package com.techlabs.basic;

public class TestFunction {
	public static void main(String args[]) {
		showHeader();
		// printEvenNos(50);
		// printEvenNos(20,50);
		showFooter();

		int[] evennum = giveMeEvenNos(10);
		// printEvenArray(evennum);

		int[] evennum2 = giveMeEvenNos(10, 30);
		printEvenArray(evennum2);
	}

	private static boolean isEvenNo(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	private static void printEvenArray(int[] evenarray) {
		for (int position = 0; position < evenarray.length; position++) {
			System.out.println(evenarray[position]);
		}
	}

	private static int[] giveMeEvenNos(int limit) {
		int arrsize = 0;
		int j = 0;
		for (int number = 0; number <= limit; number++) {
			if (isEvenNo(number)) {
				arrsize++;
			}
		}
		// int[] arr = new int[arrsize];
		int[] evenarray = new int[arrsize];

		for (int number = 0; number <= limit; number++) {
			if (isEvenNo(number)) {
				evenarray[j] = number;
				j++;
			}
		}
		return evenarray;

	}

	private static int[] giveMeEvenNos(int startno, int endno) {
		int arrsize = 0;
		int j = 0;
		for (int number = startno; number <= endno; number++) {
			if (isEvenNo(number)) {
				arrsize++;
			}
		}
		int[] evenarray = new int[arrsize];
		for (int number = startno; number <= endno; number++) {
			if (isEvenNo(number)) {
				evenarray[j] = number;
				j++;
			}
		}
		return evenarray;
	}

	private static void showHeader() {
		System.out.println("------SWABHAV TECHLABS---");
	}

	private static void showFooter() {
		System.out.println("-----copyright@2018----");
	}

	public static void printEvenNos(int limit) {
		for (int number = 0; number <= limit; number++) {
			if (isEvenNo(number)) {

				System.out.println(number);
			}
		}
	}

	public static void printEvenNos(int start, int end) {
		for (int startno = start; startno <= end; startno++) {
			if (isEvenNo(startno)) {
				System.out.println(startno);
			}
		}

	}
}
