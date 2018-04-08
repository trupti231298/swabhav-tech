package com.techlabs.circlearea;

public class Circle {
	private double radius;
	private double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;

	}

	public double Area() {
		double Area = PI * this.radius * this.radius;
		return Area;
	}

	public Circle greaterCircle(Circle second) {
		if (this.Area() > second.Area()) {
			return this;
		}
		return second;
	}

}
