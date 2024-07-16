package com.abc.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachCharacterInString {
	public static void main(String[] args) {
		
		String inputString="This my world world in Haven Haven in Heaven";
		
		Map<Character, Long> collect = inputString.toUpperCase().chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		;
		
		Iterator<Entry<Character,Long>> it=collect.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Character, Long> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}

		Arrays.stream(inputString.toUpperCase().split(" "))
				.peek(s->System.out.println(s))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.forEach((s,t)->System.out.println(s+"  "+t));




	}

}
