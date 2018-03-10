package com.techlabs.rectangleconstructor;

public class Rectangle {
	private int length;
	private int breadth;
	private BorderStyle borderstyle;

	public Rectangle(int plength, int pbreadth, BorderStyle pborderstyle) {
		length = plength;
		breadth = pbreadth;
		borderstyle = pborderstyle;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public BorderStyle getBorderStyle() {
		return borderstyle;
	}

	public void Area() {
		int Area = length * breadth;
		System.out.println("Area of rectangle:" + Area);
	}

}
