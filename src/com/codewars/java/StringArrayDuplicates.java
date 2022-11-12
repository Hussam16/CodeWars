package com.codewars.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "abracadabra", "allottee", "assessee" };
		LinkedList<String> listOfWord = new LinkedList<String>();

		String str = "assessee";
		
		System.out.println(returnWord(str));
		


	}
	

	public static String returnWord(String w1) {
		String Word = "";
		char[] arrayCharcters = w1.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : arrayCharcters) {
			list.add(c);
		}

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == list.get(i + 1))
				list.remove(i);
		}

		for (Character character : list) {
			Word = Word + character;
		}
		return Word;
	}

}
