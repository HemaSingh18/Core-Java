package com.rays.java.collectionf;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(0,"Ram");
		v.add(1,28);
		v.add(2,"a");
		v.add(3,"Ram");
		v.add(4,"shyam");
		System.out.println("Elements :"+v);
		
		System.out.println("----Enumeration----");
		
		Enumeration e = v.elements(); //
		
		v.add(4,"Rohan"); // Fail Safe
		
		
		  while(e.hasMoreElements()) 
		  {
			  Object o = e.nextElement();
		  System.out.println("Element :"+o); 
		  }
		System.out.println(v);
		 
	}
}
