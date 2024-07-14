package com.abc.java;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounting {
	
	public static void main(String[] args) {
		
		String input="aamir";
		
		Map<Character, Long> collect = input.chars()
		.mapToObj(c->(char) c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	Iterator<Entry<Character, Long>> iterator = collect.entrySet().iterator();
	
	while(iterator.hasNext()) {
		Entry<Character, Long> entry = iterator.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
		
	}

}
