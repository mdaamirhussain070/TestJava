package com.abc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoUnSortedInSingleSortedArray {
	public static void main(String[] args) {
		
		int[] arr= {1,33,24,11,44,67,1,3,4};
		
		int arrr[]= {99,9,7,44,5,67,76,79};
		
		int[] array = IntStream.concat(Arrays.stream(arr), Arrays.stream(arrr))
		.sorted().toArray();
		
		for(Integer i:array) {
			System.out.println(i);
		}
		
		//Convert int Array to Integer Array
		
		Integer[] list = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		//Three max and min number from the list
		
		System.out.println("Three max and min number from the list");
	
		Arrays.stream(list).sorted().limit(3).forEach(s->System.out.println(s));	
		
		
		System.out.println("Three max and min number from the list");
		
		Arrays.stream(list).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
	}

}
