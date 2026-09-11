package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparableMarksheet {
	
	public static void main(String[] args) {
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet("1234"," ramu ",20));
		list.add(new Marksheet("456","neha",30));
		list.add(new Marksheet("789","raj",40));
		list.add(new Marksheet("147","Mina",80));
		list.add(new Marksheet("852","abhi",10));
		
		//System.out.println(list);
		
		list.forEach(System.out::println);
		
		System.out.println("---------sorted Marksheet------------");
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("-------------Iterator-------------");
		
		Iterator t = list.iterator();
		
		while(t.hasNext()) {
			Object o = t.next();
			System.out.println(o);
		}
	}

}
