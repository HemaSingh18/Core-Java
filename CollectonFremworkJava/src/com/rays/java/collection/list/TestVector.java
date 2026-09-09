package com.rays.java.collection.list;

import java.util.Vector;

//Vector ek dynamic array hai jo synchronized hota hai, yani ye thread-safe operations provide karta hai.
//vector increase double of its size
//thread safe
//slow performance
public class TestVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement(25);
		v.addElement("Mohan");
		System.out.println(v);
		
		System.out.println(v.elementAt(1));
		System.out.println(v.get(1));
		
	}
}
