package com.techlabs.player.test;

import com.techlabs.player.Player;

public class TestPlayer {
	public static void main(String args[]) {
		Player p1 = new Player(101, "virat", 30);
		Player p2 = new Player(105, "sachin", 45);
		printDetails(p1);
		System.out.println("");
		printDetails(p2);
		Player p = p1.whoIsElder(p2);
		System.out.println("Older:" + p.getName());

	}

	public static void printDetails(Player p) {
		System.out.println("Id:" + p.getId());
		System.out.println("Name:" + p.getName());
		System.out.println("Age:" + p.getAge());
	}
}
