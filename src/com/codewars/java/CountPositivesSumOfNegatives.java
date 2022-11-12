package com.codewars.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountPositivesSumOfNegatives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 };

		System.out.println(Arrays.stream(input).filter(e -> e > 0).count());

		countPositivesSumNegatives(input);
	}

	public static int[] countPositivesSumNegatives(int[] input) {
		if(input==null||input.length==0) {
			int[] emptyArray = {};
			return emptyArray;
		}

					
		
		int count = (int) Arrays.stream(input).filter(e -> e > 0).count();
		int sum = Arrays.stream(input).filter(e -> e < 0).sum();
		int x[] = { count, sum };
		return x;
	}
}
