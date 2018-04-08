package com.techlabs.gameapp2;

import java.util.*;

import javax.naming.spi.ResolveResult;

public class NumberGame {
	private int noToBeGuessed;
	private int noGuessed;
	private ResultType result;

	public NumberGame() {
		Random random = new Random();
		noToBeGuessed = random.nextInt(100);
		System.out.println("System generated no:" + noToBeGuessed);

	}

	public ResultType checkResult(int noGuessed) {

		if (noGuessed > noToBeGuessed) {
			return ResultType.TO_HIGH;
		} else if (noGuessed < noToBeGuessed) {
			return ResultType.TO_LOW;
		} else if (noGuessed == noToBeGuessed) {
			return ResultType.MATCH;

		}

		return ResultType.MATCH;

	}

}
