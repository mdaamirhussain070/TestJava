package com.abc.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,72,62,45};
		
		int[] array = IntStream.rangeClosed(1, arr.length)
		.map(i->arr[arr.length-i])
		.toArray();
		
		Arrays.stream(array).boxed().forEach(s->System.out.println(s));
	}

}
