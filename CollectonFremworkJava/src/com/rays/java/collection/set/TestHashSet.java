package com.rays.java.collection.set;

import java.util.HashSet;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		//only one null value except
		HashSet h = new HashSet();
		h.add(null);
		h.add('a');
		h.add('b');
		h.add(52);
		h.add("sita");
		h.add(null);
		h.add(null);
		System.out.println(h);
				
	}

}
