package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setWidth(26);
		r1.setHeight(20);
		printDetails(r1);

		Rectangle r2 = new Rectangle();
		r2.setWidth(40);
		r2.setHeight(30);
		printDetails(r2);

		Rectangle r3 = new Rectangle();
		r3.setWidth(50);
		r3.setHeight(40);
		printDetails(r3);

		Rectangle temp;
		temp = r1;
		printDetails(temp);
		temp.setHeight(1);
		printDetails(temp);
		printDetails(r1);

		System.out.println(temp.hashCode());
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());

		Rectangle[] rectangleArray = new Rectangle[3];
		rectangleArray[0] = r1;
		rectangleArray[1] = r2;
		rectangleArray[2] = r3;

		System.out.println("Details of rectangles:");
		for (int i = 0; i < rectangleArray.length; i++) {
			// rectangleArray[i] = new Rectangle();
			printDetails(rectangleArray[i]);
		}
		System.out.println("object details:");
		printDetails(new Rectangle());
		printDetails(null);

	}

	public static void printDetails(Rectangle r) {

		System.out.println("width=" + r.getWidth());
		System.out.println("height" + r.getHeight());
		System.out.println("Area of rectangle:" + "" + r.calculateArea());
		System.out.println("");
		System.out.println(r.hashCode());
	}

}
