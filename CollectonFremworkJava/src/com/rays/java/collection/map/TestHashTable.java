package com.rays.java.collection.map;

import java.util.Hashtable;

//Hashtable does not contain duplicate key.
//Hashtable does not contain null key.
//Hashtable does not contain null value.
//not maintain order
public class TestHashTable {
	public static void main(String[] args) {
		 
		Hashtable h = new Hashtable();
		h.put(1, "meena");
		h.put(2, "radha");
		h.put(3, "Karuna");
		h.put("Nehal", 4);
		h.put(5, "Five");
		
		System.out.println(h);
		
		System.out.println(h.get(3));
		
		System.out.println(h.containsKey(2));
		
		System.out.println(h.containsValue(h));
		
		System.out.println(h.keySet());
		
		System.out.println(h.values());
		
		System.out.println(h.entrySet());
		
//		for(Object o :h.entrySet()) {
//			System.out.println(o);
//		}
		
		for(Object o :h.keySet()) {
			System.out.println(o);
			
		}
	}

}
