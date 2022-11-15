package com.codewars.java;

import java.util.Arrays;

public class EvenNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] z = returnEvenArray(x, 3);

	}

	private static int[] returnEvenArray(int[] x, int limitNumber) {

		return Arrays
				.stream(Arrays.stream(Arrays.stream(x).filter(e -> e % 2 == 0).toArray()).filter(e -> e % 2 == 0)
						.toArray())
				.skip(Arrays.stream(x).filter(e -> e % 2 == 0).toArray().length - limitNumber).toArray();
	}
}
