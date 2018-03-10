package com.techlabs.rectangleconstructor.test;

import com.techlabs.rectangleconstructor.Rectangle;
import com.techlabs.rectangleconstructor.BorderStyle;

public class TestRectangleconstructor {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(10, 20, BorderStyle.DOTTED);
		System.out.println("Details about the rectangle");
		System.out.println("Length:" + r1.getLength());
		System.out.println("Breadth:" + r1.getBreadth());
		System.out.println("Area");
		r1.Area();
		System.out.println("Border Style:" + r1.getBorderStyle());

	}

}
