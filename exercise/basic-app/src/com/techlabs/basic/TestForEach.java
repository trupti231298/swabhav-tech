package com.techlabs.basic;

public class TestForEach {
	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 40, 50 };
		String[] names = { "tom", "harry", "jill" };
		for (int mark : marks) {
			System.out.println(mark);
		}
		for (String getname : names) {
			System.out.println(getname);
		}

		System.out.println(args.length);
		for (String greet : args) {
			System.out.println("Hello! " + "" + greet);
		}

	}
}
