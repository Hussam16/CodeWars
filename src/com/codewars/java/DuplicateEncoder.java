package com.codewars.java;

import java.util.HashMap;


public class DuplicateEncoder {

	public static void main(String[] args) {
		
		System.out.println(encode("Success"));

	}
	static String encode(String word){
		
		String finalWord="";
		String newWord=word.toLowerCase().replaceAll(" ", "/");
		

		char[] charArray = newWord.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {

			if (!(hashMap.containsKey(charArray[i]) == true))
				hashMap.put(charArray[i], 1);

			else
				hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);

		}

		for (int i = 0; i < charArray.length; i++) {

			if (hashMap.get(charArray[i]) == 1)
				finalWord = finalWord + "(";
			else
				finalWord = finalWord + ")";

		}
	    return finalWord;
	  }
}
