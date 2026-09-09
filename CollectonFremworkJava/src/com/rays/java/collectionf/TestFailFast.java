package com.rays.java.collectionf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {
		
		List list = new  ArrayList();
		list.add(0,"Mohan");
		list.add(1,"Gupta");
		list.add(2,"age");
		list.add(3,29);
		list.add(4,"Rama");
		list.add(5,"Ram");
		System.out.println(list);
		
		System.out.println("-----------Iterator type Cast------------");
		Iterator<String> it = list.iterator();
		
	//list.add("Sita");  //fail-fast --java.util.ConcurrentModificationException
	
	while(it.hasNext()) {
		
		Object o = it.next();
		System.out.println("Element :"+o);
		it.remove();
	}
//	System.out.println("list :"+list);
	
	list.add("shyam");
	System.out.println(list);
	}
}
