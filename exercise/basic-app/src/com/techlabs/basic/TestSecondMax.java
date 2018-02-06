package com.techlabs.basic;

public class TestSecondMax {
	public static void main(String[] args) {
		int[] nos = { 10, 20, 320, 40, 50, 320, 50 };
		int[] firstandsecondmax = getMaxAndSecondMax(nos);
		for (int i = 0; i < firstandsecondmax.length; i++) {
			System.out.println(firstandsecondmax[i]);
		}

	}

	private static int[] getMaxAndSecondMax(int[] nos) {
		int[] num = new int[2];
		int position = 0;
		num[0] = nos[0];

		for (position = 0; position < nos.length; position++) {
			if (nos[position] > num[0]) {
				num[0] = nos[position];
			}
		}

		for (position = 1; position < nos.length; position++) {

			if (nos[position] > num[1]) {
				if (nos[position] == num[0]) {
					continue;
				}
				num[1] = nos[position];
			}
		}

		return num;
	}

}
