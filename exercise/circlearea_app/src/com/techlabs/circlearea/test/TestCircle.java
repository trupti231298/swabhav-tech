package com.techlabs.circlearea.test;

import com.techlabs.circlearea.Circle;

public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle(6);
		Circle c2 = new Circle(7);
		printDetails(c1);
		printDetails(c2);
		Circle c=c1.greaterCircle(c2);
		System.out.println("Greater circle is of area:"+c.Area());

	}

	public static void printDetails(Circle c) {
		System.out.println("Area of circle:" + c.Area());

	}

}
