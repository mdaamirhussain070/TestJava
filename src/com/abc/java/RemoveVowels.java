package com.abc.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveVowels {
	public static void main(String[] args) {
		
		String input="Hello Aswer All question";
		
		List<Character> asList = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		
	Set<Character> vowels=new HashSet(asList);
//	Set<List<Character>> of = Set.of(asList);
	
		String collect = input.chars()
		.mapToObj(c->(char)c)
		.filter(f->!vowels.contains(f))
		.map(String::valueOf)
		.collect(Collectors.joining());
		
		System.out.println(collect);
	}
	

}
