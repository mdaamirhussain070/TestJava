package com.abc.java;

import java.util.stream.IntStream;

public class CheckStringPalinrome {
	
	public static void main(String[] args) {
	
		String input="AAAAAM";
		
		boolean allMatch = IntStream.range(0, input.length()/2)
		.allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
		
		if(allMatch) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
