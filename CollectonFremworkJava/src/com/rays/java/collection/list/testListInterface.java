package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.List;

//add(), get(), set(), remove(), size(), isEmpty(), contains(), clear(), addAll(), removeAll().
public class testListInterface {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add("Hema"); // Element add karne ke liye.
		list.add(27);
		list.add("Mumbai");
		
		System.out.println(list);
		
		list.add(0, 104); //Specific position par element add karta hai.
		list.add(1, "Madhav");
		list.add(2, "Delhi");
		System.out.println(list);
		
		
		System.out.println(list.get(2)); //Index se element lene ke liye.
		System.out.println(list);
		
		System.out.println(list.set(0, "Karuna") ); //Existing element ko update karne ke liye.
		System.out.println(list);
		
		System.out.println(list.remove(2)); //Index ke according element remove karta hai.
		System.out.println(list);
		
		System.out.println(list.remove("Hema")); //Specific element remove karta hai, return boolean
		System.out.println(list);
		
		System.out.println(list.size()); //Total elements count karta hai.
		
		System.out.println(list.isEmpty()); //Check karta hai list empty hai ya nahi, return boolean
		System.out.println(list);
		
		System.out.println(list.contains("Delhi")); //Check karta hai element list mein present hai ya nahi, return boolean - true and false
		System.out.println(list);
		
		System.out.println(list.indexOf("Madhav")); //Element ka first index find karta hai.
		System.out.println(list);
		
		System.out.println(list.lastIndexOf("Mumbai")); //Element ka last index find karta hai.
		
		 List l = new ArrayList();
		 l.add("Shaym");
		 l.add(55);
		 l.add(12548895);
		 
		 list.addAll(l);
		 System.out.println(list);
		 
		 System.out.println(list.containsAll(l)); // return boolean value true and false
	}
}
