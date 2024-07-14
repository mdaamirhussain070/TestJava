package com.abc.java;

public class StaticNonStaticExample {
	
	private String s="Hussain";
	public String t="Aamir";
	private static String u="Md";
	static String v="Cool";
	
	
	static class StaticExample{
		
		void show() {
		
				System.out.println(u);
				
				System.out.println(v);
			
		}
	}
	class NonStatic{
		void show1() {
			System.out.println(s);
			System.out.println(t);
		}
	}
	

}

