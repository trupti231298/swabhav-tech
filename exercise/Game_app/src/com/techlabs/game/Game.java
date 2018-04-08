package com.techlabs.game;

import java.util.*;

public class Game {

	public void start() {
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a random no.:");
		int user_random_no = s.nextInt();
		int system_random_no = random.nextInt(100);
		System.out.println("system random no.:" + system_random_no);
		if (user_random_no < system_random_no) {
			System.out.println("To low");
		} else if (user_random_no > system_random_no) {
			System.out.println("To high");
		} else {
			System.out.println("You won");
		}

	}

	public void terminate() {
		System.exit(0);
	}
}
