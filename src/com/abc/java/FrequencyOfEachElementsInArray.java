package com.abc.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementsInArray {
	
	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("HUSSAIN","AAMIR","HUSSAIN","ZERO","HERO","HAZRAT","HOTLINE","HUSSAIN","HERO","HAZRAT");
		
		strList.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((s,t)->System.out.println(s+ " "+t));
	}

}
