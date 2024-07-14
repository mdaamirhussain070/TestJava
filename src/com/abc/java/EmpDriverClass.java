package com.abc.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpDriverClass {
	
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1("123","Hussain","HR");
		Employee1 e2=new Employee1("124","Aamir","ENG");
		Employee1 e3=new Employee1("125","Afan","FIN");
		Employee1 e4=new Employee1("126","Aakif","MED");
		Employee1 e5=new Employee1("126","Aakif","HR");
		Employee1 e6=new Employee1("126","Aakif","FIN");
		Employee1 e7=new Employee1("126","Aakif","HR");
		Employee1 e8=new Employee1("126","Aakif","MED");
		
		Map<String,Employee1> map=new HashMap();
		map.put("123", e1);
		map.put("124", e2);
		map.put("125", e3);
		map.put("125", e4);
		map.put("123", e1);
		
		
		List<Employee1> asList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		
		asList.stream()
		.collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()))
		.forEach((s,t)->System.out.println(s+"  "+t));
		
		asList.stream()
		.sorted(Comparator.comparing(Employee1::getEmpID).thenComparing(Employee1::getDepartment).reversed()).forEach(s->System.out.println(s.toString()));
		
		System.out.println("______________________All record which have id multiple of 5");
				
		asList.stream()
		.filter(s->Integer.parseInt(s.getEmpID())%5!=0).
		forEach(s->System.out.println(s));
		
		
	
	}

}