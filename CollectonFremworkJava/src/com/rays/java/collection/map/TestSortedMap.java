package com.rays.java.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	// key-value pairs ko sorted order mein rakhta hai.
	// By default, keys ascending order mein hoti hain.
	// SortedMap is interface
	// Maintain Order
	// Multiple null vale allow karta hai
	// Duplicate Key not allows
	public static void main(String[] args) {
		SortedMap s = new TreeMap();
		s.put(1, "Ram");
		s.put(2, "Radha");
		s.put(3, "Monika");
		s.put(4,"madhav");
		s.put(5,"Maam");

		System.out.println(s);

		System.out.println(s.firstKey()); //first → smallest key

		System.out.println(s.lastKey()); //largest Key

		System.out.println(s.headMap(2)); //starting part

		System.out.println(s.tailMap(3)); // ending part

		System.out.println(s.subMap(2, 4)); //range

	//	s.subMap(2, 4);
	}
}
