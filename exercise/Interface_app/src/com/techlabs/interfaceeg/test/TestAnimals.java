package com.techlabs.interfaceeg.test;

import com.techlabs.interfaceeg.Tiger;
import com.techlabs.interfaceeg.Dog;
import com.techlabs.interfaceeg.Dogg;
import com.techlabs.interfaceeg.Tigerr;

public class TestAnimals extends Dogg implements Tiger, Dog {
	public void sound() {
		System.out.println("Roar!!");
		
	}
	public void eat() {
		System.out.println("Meat..");
	}
	
	public static void main(String args[]) {
		Dog obj=new Dogg();
		System.out.println("Dog");
		obj.eat();
		obj.sound();
		System.out.println("Tiger");
		TestAnimals obj1=new TestAnimals();
		obj1.sound();
		obj1.eat();
		

	}

}
