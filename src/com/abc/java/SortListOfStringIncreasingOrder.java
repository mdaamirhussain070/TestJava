package com.abc.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringIncreasingOrder {

	public static void main(String[] args) {
		
		List<String> Stringlist=Arrays.asList("INDIANIA","JOHN","CAPTAIN","america","Storng","week","weak");
		
		Stringlist.stream()
		.map(c->c.toUpperCase())
		.sorted(Comparator.comparing(String::length))
		.forEach(s->System.out.println(s));
	}
}
