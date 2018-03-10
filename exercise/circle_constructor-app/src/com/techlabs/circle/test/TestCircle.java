package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle(5.5f, "GrEEn");

		System.out.println("Details of circle :");
		System.out.println("Radius of circle:" + c1.getRadius());
	

		System.out.println("Color of circle:" + c1.getColor());
		System.out.println("Area of circle:" + c1.getArea());
	}

}
