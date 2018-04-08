package com.techlabs.game.test;

import com.techlabs.game.*;
import java.util.*;

public class TestGame {
	public static void main(String args[]) {
		while (true) {
			System.out.println("Choose one of the below:");
			System.out.println("START(y):\nEND(n):\nTERMINATE(t):\n");

			Scanner s = new Scanner(System.in);
			String option = s.nextLine();
			String yes = "y";
			String no = "n";
			String terminate = "t";
			Game g = new Game();

			if (option.equals(yes)) {
				for (int i = 0; i < 3; i++) {
					g.start();

				}
			} else if (option.equals(no)) {
				continue;
			} else if (option.equals(terminate)) {
				g.terminate();
			} else {
			}
			System.out.println("Select: y or n");
		}
	}

}
