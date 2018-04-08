package com.techlabs.gameapp2;

import java.util.*;
import com.techlabs.gameapp2.NumberGame;

import com.techlabs.gameapp2.ResultType;

public class GameController {

	public void start() {

		while (true) {

			System.out.println("Choose from the option below:");
			// System.out.println("You got 3 chance:");
			NumberGame n = new NumberGame();
			System.out.println("1.START:\n2.STOP\n");
			String yes = "1";
			String no = "2";

			Scanner s = new Scanner(System.in);
			System.out.println("Enter choice:");

			String option = s.nextLine();

			for (int i = 3; i > 0; i--) {

				if (option.equals(yes)) {
					System.out.println(i + "-attempt remaining..");
					System.out.println("Enter a random no.");
					int noGuessed = s.nextInt();

					System.out.println(n.checkResult(noGuessed));
					ResultType matched = n.checkResult(noGuessed);

					if (matched.equals(ResultType.MATCH)) {
						System.out.println("Congratulations! You Won...");
						break;
					}
				} else if (option.equals(no)) {
					continue;

				}
			}
		}
	}

}
