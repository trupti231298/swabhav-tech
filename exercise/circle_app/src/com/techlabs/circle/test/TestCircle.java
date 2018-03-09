package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		c1.setRadius(1);
		c1.setColor("Red");
		c1.calcArea();

		Circle c2 = new Circle();
		c2.setRadius(2);
		c2.setColor("Blue");
		c2.calcArea();

		Circle c3 = new Circle();
		c3.setRadius(3);
		c3.setColor("Green");
		c3.calcArea();

		Circle[] circleArray = new Circle[3];
		circleArray[0] = c1;
		circleArray[1] = c2;
		circleArray[2] = c3;

		System.out.println("Details of circle:");
		for (int i = 0; i < circleArray.length; i++) {
			printDetails(circleArray[i]);
			System.out.println("");
		}
	}

	public static void printDetails(Circle ci) {
		System.out.println("radius=" + ci.getRadius());
		System.out.println("color=" + ci.getColor());
		System.out.println("Area of circle:" + "" + ci.calcArea());

	}
}
