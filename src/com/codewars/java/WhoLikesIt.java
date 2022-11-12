package com.codewars.java;

public class WhoLikesIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"Peter","marak","max","of"};
		
		String message=null;
		
		if(names.length==0) message="no one likes this";
		else if (names.length==1) message=names[0]+" likes this";
		else if (names.length==2) message=names[0]+" and "+ names[1]+" like this";
		else if (names.length==3) message=names[0]+", "+names[1]+" and "+names[2]+" like this";
		else if (names.length>3) message=names[0]+", "+names[1]+" and "+(names.length-2)+" others like this";
		System.out.println(message);
		

	}

}
