package com.abc.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String input="Hello World";
		
		String reverse=new StringBuilder(input)
				.reverse()
				.toString();
		
		System.out.println(input +" ");
		System.out.println(reverse);
		
//		input.chars()
//		.map(c-> new StringBuilder(c).reverse())
//		.collect(Collectors.joining());
		
		String collect = Arrays.stream(input.split(" "))
		.map(c->new StringBuilder(c).reverse())
		.collect(Collectors.joining(""));
		
		//Create a list of each word
		List<String> collect2 = Arrays.stream(input.split("\\s"))
		.collect(Collectors.toList());
		System.out.println(collect);
		collect2.forEach(s->System.out.println(s.toUpperCase()));
		
		
		
		
	}
	
	
}
