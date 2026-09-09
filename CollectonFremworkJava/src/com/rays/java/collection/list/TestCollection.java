package com.rays.java.collection.list;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		Collection con = new ArrayList<>();
		con.add(102);
		con.add("Karuna");
		con.add(28);
		System.out.println(con);
		
		Collection con2 = new ArrayList<>();
		con2.add(104);
		con2.add("ram");
		con2.add(30);
		System.out.println(con2);
		
		System.out.println(con.addAll(con2)); //return boolean value and add all collection
		System.out.println(con);
		
		System.out.println(con.contains("Karuna"));  //return boolean value and check membership
		System.out.println(con);
		
		System.out.println(con.containsAll(con2));
		System.out.println(con);
		
		System.out.println(con.isEmpty()); //return boolean value, isEmpty() method ka use ye check karne ke liye hota hai ki collection ke andar koi element hai ya nahi.
		System.out.println(con);
		
		System.out.println(con.size()); //size() method ka use collection ke andar kitne elements hain ye check karne ke liye hota hai.
		
		System.out.println(con.remove(30)); //remove a element
		System.out.println(con);
		
		System.out.println(con.removeAll(con2)); // return boolean, ka use ek collection ke common elements ko doosri collection se remove karne ke liye hota hai.
		System.out.println(con);
		
		con.clear(); //clear() ka use collection ke saare elements remove karne ke liye hota hai.
		System.out.println(con);

	}
}
