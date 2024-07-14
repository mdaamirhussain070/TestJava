package com.abc.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFormList {
	public static void main(String[] args) {
		
		List<String> strList=Arrays.asList("HUSSAIN","AAMIR","HUSSAIN","ZERO","HERO","HAZRAT","HOTLINE","HUSSAIN","HERO","HAZRAT");
		
		String string = strList.stream()
		.distinct().collect(Collectors.joining(" ")).toLowerCase().toString();
		
		System.out.println(string);
	}

}
