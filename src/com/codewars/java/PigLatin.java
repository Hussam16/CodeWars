package com.codewars.java;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pigIt("Hello world !"));
		//System.out.println(pigIt("This is my string"));
		
		
		String word="woord";
		char x = word.charAt(0);
		char y=' ';
		//System.out.println(word.replace(x, y)+word.charAt(0)+"ay");

	}

	public static String pigIt(String str) {
		
		

		String latinWord = "";

		String words[] = str.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			char x = words[i].charAt(0);
			char y=' ';
			
			if(words[i].length()!=1)latinWord = latinWord+words[i].replace(x, y)+words[i].charAt(0) + "ay";
			else latinWord=latinWord+words[i];
			

		}

		return latinWord.trim();
		// Write code here
	}

}
