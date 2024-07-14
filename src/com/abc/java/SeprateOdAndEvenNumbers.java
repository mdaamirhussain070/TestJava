package com.abc.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SeprateOdAndEvenNumbers {
	
	/*
	 * Seprate Odd and Even number frome a list
	 */
	public static void main(String[] args) {
		
		List<Integer> listNumber=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,220);
		
		Map<Boolean, List<Integer>> collect = listNumber.stream()
		.collect(Collectors.partitioningBy(i-> i%2==0));
		
		//Using entrySet() with a for-each loop:
	   for(Entry<Boolean, List<Integer>> entry:collect.entrySet()) {
		   if(!entry.getKey()) {
			   System.out.println("Odd Number = "+entry.getValue());
		   }else {
			   System.out.println("Even Number = "+entry.getValue());
		   }
	   }
	   //Using keySet() to iterate over keys:
	   for(Boolean key:collect.keySet()) {
		 
		   if(!key) {
			   System.out.println("Odd Nnmber = "+collect.get(key));
		   }else {
			   System.out.println("Even Number = "+collect.get(key));
		   }
	   }
	   //Using values() to iterate over values:
	   for(List<Integer> list:collect.values()) {
		   
		   list.stream()
		   .filter(i->i%2==0)
		   .forEach(i->System.out.println("Even Number = "+i));
		   list.stream()
		   .filter(i->i%2!=0)
		   .forEach(t ->System.out.println("Odd Number = "+t) );
	   }
	   //Using an iterator:
	   Iterator<Entry<Boolean, List<Integer>>> iterator=collect.entrySet().iterator();
	   while(iterator.hasNext()) {
		   Entry<Boolean, List<Integer>> entry = iterator.next();
		  if(!entry.getKey()) {
			  System.out.println("Odd number = "+entry.getValue());
		  }else {
			  System.out.println("Even number = "+entry.getValue());
		  }
	   }
	}

}
