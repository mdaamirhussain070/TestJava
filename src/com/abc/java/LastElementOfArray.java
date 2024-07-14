package com.abc.java;

import java.util.Arrays;
import java.util.List;

public class LastElementOfArray {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("HUSSAIN","METAL","IRON","HYDROGEN","HELIUM");
		
		String string = list.stream()
		.skip(list.size()-1).findFirst().get();
		
		System.out.println(string);
	}

}
