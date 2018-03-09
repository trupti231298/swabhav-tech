package com.techlabs.rectangle;

public class Rectangle {
	private int width;
	private int height;
	final int LESSTHAN_LOWERLIMIT = 0;
	final int START_POINT = 1;
	final int END_POINT = 100;

	public int convertToValidRange(int num) {
		if (num < LESSTHAN_LOWERLIMIT) {
			return START_POINT;
		} else if (num > END_POINT) {
			return END_POINT;
		} else {
			return num;
		}
		

	}

	public void setWidth(int w) {
		width = convertToValidRange(w);
		
	}

	public void setHeight(int h) {
		height = convertToValidRange(h);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int calculateArea() {
		int area = width * height;
		return area;
	}
	
}

