package com.codewars.java;

import java.util.ArrayList;

import java.util.List;

public class FindTheMissingLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] charArray = { 'O', 'Q', 'R', 'S' };
		System.out.println(findMissingLetter(charArray));

	}

	public static char findMissingLetter(char[] array) {
		char x = 0;
		List<Character> listC = new ArrayList<Character>();

		for (char c : array) {
			listC.add(c);
		}

		for (char i = array[0]; i <= array[array.length - 1]; i++) {

			if (!listC.contains(i) == true)
				x = i;

		}

		return x;
	}

}
