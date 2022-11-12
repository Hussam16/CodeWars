package com.codewars.java;

import java.util.ArrayList;

public class FindOutlier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {160, 3, 1719, 19, 11, 13, -21};
		System.out.println(find(x));

	}

	static int find(int[] integers) {

		int outliner;
		int a[] = integers;

		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0)
				A.add(a[i]);
			else
				B.add(a[i]);
		}

		if (A.size() > B.size())
			outliner = B.get(0);
		else
			outliner = A.get(0);

		return outliner;

	}
}
