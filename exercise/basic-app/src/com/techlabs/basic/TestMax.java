package com.techlabs.basic;

public class TestMax {
	public static void main(String args[]) {

		int[] marks = { 100, 20, 3000, 40 };
		int maxno = getMaximumMark(marks);
		System.out.println(maxno);

	}

	private static int getMaximumMark(int[] marks) {
		int no = 0;
		no = marks[0];
		for (int position = 0; position < marks.length; position++) {
			if (marks[position] > no) {
				no = marks[position];
			}
		}

		return no;
	}

}
