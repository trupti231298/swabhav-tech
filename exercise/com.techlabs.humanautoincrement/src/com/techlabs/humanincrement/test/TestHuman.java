package com.techlabs.humanincrement.test;

import com.techlabs.humanincrement.Human;

public class TestHuman {
	public static void main(String args[]) {
		Human h1 = new Human("Trupti", 20);
		Human h2 = new Human("Bharsh", 25);
		System.out.println(h1.getId());
		System.out.println(h2.getId());
		System.out.println(h1.getId());

	}

}
