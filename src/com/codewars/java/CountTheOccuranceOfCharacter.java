package com.codewars.java;

import java.util.HashMap;

public class CountTheOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "aaaabcdddff";

		char[] charArray = name.toCharArray();

		

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {

			if (hashmap.containsKey(charArray[i])) {
				hashmap.put(charArray[i], hashmap.get(charArray[i]) + 1);
			} else {
				hashmap.put(charArray[i], 1);
			}

		}
		System.out.println(hashmap);

	}

}
