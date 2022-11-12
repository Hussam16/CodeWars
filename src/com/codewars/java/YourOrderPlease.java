package com.codewars.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class YourOrderPlease {

	public static void main(String[] args) {

		System.out.println(order("is2 Thi1s T4est 3a"));

	}

	public static String order(String words) {
		String input = words;

		if (input.isEmpty()) {

			input = "";
		}

		else {
			String orderString = "";
			int counter = 0;
			String[] strArray = input.split(" ");
			HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

			for (int i = 0; i < strArray.length; i++) {
				hashmap.put(strArray[i], Integer.parseInt(strArray[i].replaceAll("[^0-9]", "")));
			}

			while (counter != hashmap.size()) {
				for (Entry<String, Integer> entry : hashmap.entrySet()) {

					if (entry.getValue().equals(counter + 1)) {
						orderString = orderString + " " + entry.getKey();
						counter++;
					}
				}

			}
			return input = orderString.trim();
		}
		return input;

		// ...
	}
}
