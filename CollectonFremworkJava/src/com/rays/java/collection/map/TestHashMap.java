package com.rays.java.collection.map;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put("Four", 4);
		m.put(5, "Five");
		
		System.out.println(m);
		
		System.out.println(m.containsKey(2)); // return boolean
		System.out.println(m.containsValue("seven"));
		System.out.println(m.get(3));
		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
		System.out.println(m.isEmpty());
		
		
	}

}
