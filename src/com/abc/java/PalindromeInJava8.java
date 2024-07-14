package com.abc.java;

import java.util.stream.IntStream;

public class PalindromeInJava8 {
	public static void main(String[] args) {
		
		String str="AAAAAAM";
		
		boolean noneMatch = IntStream.range(0, str.length())
		.noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
		
		if(noneMatch) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
