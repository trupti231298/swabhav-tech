package com.techlabs.circle;

public class Circle {
	private float radius;
	private float PI=22/7;
	private String color;

	public void setRadius(float r) {
		radius = r;

	}

	public void setColor(String c) {
		color = c;

	}

	public float getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public float calcArea() {
		float Area = PI* radius * radius;
		return Area;
	}

}
