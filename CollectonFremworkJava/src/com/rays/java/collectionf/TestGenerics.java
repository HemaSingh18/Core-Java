package com.rays.java.collectionf;

import java.util.ArrayList;

//Generic provides a way in way in order to communicate the type of collection to the compiler.
//Defines types of a collection to compiler
public class TestGenerics {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		//list.add("ram");// compiler Error....
		System.out.println(list);
	}

}
