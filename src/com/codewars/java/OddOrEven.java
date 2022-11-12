package com.codewars.java;

import java.util.Arrays;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x[]= {0,1,4};
		
		int y = (Arrays.stream(x).map(e->e).sum());
		
		
		
		
		
		
	}
	public static String oddOrEven (int[] array) {
		
		String word;
		int y = (Arrays.stream(array).map(e->e).sum());
		if(y%2==0) word="even";
		else word="odd";
		
		return word;
		  // your code
		  }

}
