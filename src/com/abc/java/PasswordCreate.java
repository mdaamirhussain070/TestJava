package com.abc.java;

public class PasswordCreate {
	
	public static String passwordCreate() {
		String passwordString="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&";
		int min=0;
		int max=passwordString.length()-1;
		StringBuilder str=new StringBuilder();
				
		for(int i=0;i<6;i++) {
			
			int index=(int) (Math.random()*(max-min+1))-min;
			char c=passwordString.charAt(index);
			str.append(c);
		}
				
	return str.toString();
		
	}
	public static void main(String[] args) {
		;
		System.out.println(passwordCreate()); //7oAIPo,UCNx2D

	}

}
