package com.codewars.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class GetTheSmallestAndBiggestNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int list[]= {4,6,2,1,9,63,-134,566};
		List<Integer> myList = new ArrayList();
		for (int i = 0; i < list.length; i++) {
			
			myList.add(list[i]);
		}
		
		IntStream.of(list).min().getAsInt();
		IntStream.of(list).max().getAsInt();

	}

	public int min(int[] list) {
		return IntStream.of(list.stream().mapToInt(i->i).toArray()).min().getAsInt(); 
	}

	public int max(int[] list) {
		return 0;
	}

}
