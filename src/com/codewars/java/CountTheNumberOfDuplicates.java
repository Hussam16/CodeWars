package com.codewars.java;

import java.util.HashSet;

public class CountTheNumberOfDuplicates {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "ABBA";
		
		word.toLowerCase().toCharArray();

		// 1- String to array

		char[] charArray = word.toCharArray();

		HashSet<Character> A = new HashSet<Character>();
		

		HashSet<Character> B = new HashSet<Character>();

		// 2- loop through the char array
		for (int i = 0; i < charArray.length; i++) {
		

			if (A.add(charArray[i]) == false) {

				B.add(charArray[i]);
			}

		}

		System.out.println(B.size());



	}
	

	
	
	
	
}
