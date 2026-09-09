package com.rays.java.collection.map;

import java.util.HashMap;
import java.util.Map;

// map me hum (key, value) dete hai
//map is interface , package java.util
//map is a part of collection but not its child
//map doesn't inherit collection
//map has three child ---HashMap(class), HashTable(Class), SortedMap(Interface)---->child(TreeMap(class))
//unordered
public class TestMap {
	
	public static void main(String[] args) {
		Map p = new HashMap();
		    //(Key , Value) 
		p.put("ram", 1);
		p.put("Shyam", 2);
		p.put(3, "radha");
		p.put(4, "Four");
		
		System.out.println(p);
		
		System.out.println(p.get("ram"));//Key
		System.out.println(p.containsKey(3)); //Key Pass karenge, return boolean ayega true and false
		System.out.println(p.containsValue("radha")); // value pass karenge
		System.out.println(p.keySet());
		System.out.println(p.values());
		System.out.println(p.entrySet());
		System.out.println(p.remove(4)); //pair delete karta hai key pass kiya to
		System.out.println(p);
		System.out.println(p.size());
		p.clear();
		System.out.println(p);
	}

}
