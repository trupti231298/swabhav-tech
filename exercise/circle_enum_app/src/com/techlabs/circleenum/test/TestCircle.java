package com.techlabs.circleenum.test;
import com.techlabs.circleenum.Circle;
import com.techlabs.circleenum.ColorOption;
public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle(5.5f, ColorOption.RED);

		System.out.println("Details of circle :");
		System.out.println("Radius of circle:" + c1.getRadius());
	

		System.out.println("Color of circle:" + c1.getColor());
		System.out.println("Area of circle:" + c1.getArea());
	}


}
