package com.abc.java;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumAverage {
	
	public static void main(String[] args) {
		
		int[] arr= {1,11,2,21,22,34,45,3,1,5};
		
		int sum = Arrays.stream(arr).sum();
		
		OptionalDouble average = Arrays.stream(arr).average();
		
		System.out.println("Sum = " + sum +"   Average = "+average.getAsDouble() );
	}

}
