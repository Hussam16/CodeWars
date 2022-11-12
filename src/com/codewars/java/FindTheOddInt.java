package com.codewars.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindTheOddInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 };
		int odd = 0;

		// 1- Create a hashmap of <integars,integars>

		HashMap<Integer, Integer> hashIntegars = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {

			if (hashIntegars.containsKey(a[i]) == false)
				hashIntegars.put(a[i], 1);
			else
				hashIntegars.put(a[i], hashIntegars.get(a[i]) + 1);

		}

		for (Entry<Integer, Integer> entry : hashIntegars.entrySet()) {

			if (!(entry.getValue() % 2 == 0))
				odd = entry.getKey();

		}

		System.out.println(odd);

		// 3- check if the map contains the number add integar,integarValue+1
		// 4- Create an Integar
		// 5- loop through the map
		// 6- Check if the value 's odd
		// 7- Assign the Key to a number
		// 8- return the number

	}

}
