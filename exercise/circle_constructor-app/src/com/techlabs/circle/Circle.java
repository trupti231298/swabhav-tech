package com.techlabs.circle;

public class Circle {
	private float radius;
	private String color;

	public Circle(float pradius, String pcolor) {
		radius = pradius;
		color = pcolor;
	}

	public float getRadius() {
		return radius;
	}

	public String getColor() {
		String color1 = color.toLowerCase();

		if (color1.equals("red") || color1.equals("blue") || color1.equals("green")) {
			return color1;
		} else {
			return "red";
		}
	}

	public double getArea() {
		double Area = (22 / 7) * radius * radius;
		return Area;
	}

}
