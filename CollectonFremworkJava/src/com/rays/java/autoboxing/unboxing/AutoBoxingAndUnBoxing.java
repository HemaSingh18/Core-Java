package com.rays.java.autoboxing.unboxing;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {
		
		int a = 5;
		//Integer i = new Integer(a); //old Autoboxing
		
		Integer b = a; //new AutoBoxing
		
		int k = b; //Un-Boxing
		
		System.out.println("--------------------------------");
		
		System.out.println(Integer.max(5, 10));
		
		System.out.println("-----------------------------");
		
		String str = "45";
		int c = Integer.parseInt(str); //parse String to int
		System.out.println(c);
		
		System.out.println("------------------------------");
		
		String s = String.valueOf(c); //parse int to String ,...//Value ko wrapper object mein convert karta hai.
		System.out.println(s);
	}
}
