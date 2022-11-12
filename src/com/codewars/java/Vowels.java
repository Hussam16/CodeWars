package com.codewars.java;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getCount("abracadabra"));

	}

	public static int getCount(String str) {
		return str.length()-str.replaceAll("[aeiou]", "").length();

	}

}
