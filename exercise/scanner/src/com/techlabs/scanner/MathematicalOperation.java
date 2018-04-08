package com.techlabs.scanner;

import java.util.Scanner;

public class MathematicalOperation {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no.:");
		int n1 = s.nextInt();
		System.out.println("First no. is:" + n1);
		System.out.println("Enter second no.:");
		int n2 = s.nextInt();
		System.out.println("Second no. is:" + n2);
		System.out.println("Addition:" + (n1 + n2));
		System.out.println("Subtraction:" + (n1 - n2));
		System.out.println("Multiplication:" + (n1 * n2));
		System.out.println("Division:" + (n1 / n2));

	}

}
