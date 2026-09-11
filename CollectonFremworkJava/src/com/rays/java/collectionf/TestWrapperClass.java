package com.rays.java.collectionf;

public class TestWrapperClass {
	
	public static void main(String[] args) {
		
		String str = "5";
		
		int i = Integer.parseInt(str); //String ko int mein convert karta hai.
		System.out.println(i);
		
		System.out.println("------------------------");
		long l = Long.parseLong(str);
		System.out.println(l);
		
		System.out.println("-------------------------");
		int sum = Integer.sum(5, 10); 
		System.out.println(sum);
		
		System.out.println("-------------------------");
		double d =Double.parseDouble(str); //String ko double mein convert karta hai.
		System.out.println(d);
		
		System.out.println("---------------------------");
		Integer a =100;
		String s = a.toString(); //Number ko String mein convert karne ke liye use kar sakte hain.
		System.out.println(s);
		
		System.out.println("----------------------------");
		Integer b = 10;
		Integer c= 20;                       //a < b  → negative ,...a > b  → positive ,..a == b → 0         
		System.out.println(b.compareTo(c)); //Do wrapper values ko compare karta hai.
		
		System.out.println("--------------------------");
		Integer a1 =10;
		Integer b1=20;
		System.out.println(a1.equals(b1));  //Do wrapper objects ki value compare karta hai.
		
		System.out.println("--------------------------");
		Integer a3=100;
		int b2 = a3.intValue();  //Integer object ko int mein convert karta hai.
		System.out.println(b2);
		
		System.out.println("----------------------------");
		Integer d4 = 10;
		double c1 = d4.doubleValue();  //Wrapper value ko double mein convert karta hai.
		System.out.println(c1);
		
		
		
	}

}
