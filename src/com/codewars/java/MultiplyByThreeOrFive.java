package com.codewars.java;

public class MultiplyByThreeOrFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=10;
		int sum=0;
		for (int i = 1; i < number; i++) {
			
			if(i%3==0||i%5==0) sum=sum+i;
			
		}
		System.out.println(sum);

	}

}
