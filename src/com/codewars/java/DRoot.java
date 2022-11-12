package com.codewars.java;

public class DRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(digital_root(504856));
		System.out.println(sumOfArray(504856));
		newApproch(504856);

	}

	public static int digital_root(int n) {

		int size = Integer.toString(sumOfArray(n)).length();
		int sum = sumOfArray(n);
		if (size >= 1)
			return sum = sumOfArray(sum);
		else
			return sum;

// ...
	}

	public static int sumOfArray(int n) {
		int total = 0;
		char[] charArray = Integer.toString(n).toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			total = total + Character.getNumericValue(charArray[i]);
		}
		return total;

	}

	public static void newApproch(int number) {
		int sizeOld = Integer.toString(sumOfArray(number)).length();
		int sumOfArray=sumOfArray(number);
		int returnedNumber=sumOfArray;
		while (sizeOld == 2) {
			returnedNumber=sumOfArray(sumOfArray);
			--sizeOld;
			}
		System.out.println(returnedNumber);

	}

}
