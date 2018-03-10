package com.techlabs.circleenum;

public class Circle {
	private float radius;
	private ColorOption color;

	public Circle(float pradius, ColorOption pcolor) {
		radius = pradius;
		color = pcolor;
	}

	public float getRadius() {
		return radius;
	}

	public ColorOption getColor() {

		return color;
	}

	public double getArea() {
		double Area = (22 / 7) * radius * radius;
		return Area;
	}

}
