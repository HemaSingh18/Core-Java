package com.rays.java.autoboxing.unboxing;

//Autoboxing = Primitive data type ko Wrapper class object mein automatically convert karna.
//int -->Integer , Java automatically int ko Integer object mein convert kar deta hai.
//Autoboxing is the automatic conversion of a primitive type into its corresponding wrapper class object.
public class TestAutoBoxing {
	
	public static void main(String[] args) {
		
		int a =10;
		
		Integer i = a; //Autoboxing
		
		System.out.println(i);
		
	}

}
