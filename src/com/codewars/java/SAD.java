package com.codewars.java;

import java.util.LinkedList;
import java.util.List;

class SAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x[] = {"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"};
		
		dup(x);


	}

	public static String[] dup(String[] arr) {
		List<String> listString = new LinkedList<String>();

		for (int i = 0; i < arr.length; i++) {

			listString.add(returnEditString(arr[i]));
		}
		
		System.out.println(listString);
		String[] array = listString.toArray(new String[listString.size()]);
		return array;

		// ..
	}

	public static String returnEditString(String x) {
		String teString = null;

		String word = x;
		StringBuilder sb = new StringBuilder(word);

		for (int i = 0; i < sb.length(); i++) {
			if ((i + 1) == sb.length())
				break;

			if (sb.charAt(i) == sb.charAt(i + 1))
				sb.deleteCharAt(i);

			teString = sb.toString();

		}
		return teString;

	}

}
