package com.rays.java.collection.list;

import java.util.LinkedList;

//LinkedList Java Collection Framework ki class hai. Isme normal List methods ke saath First/Last position ke liye extra methods milte hain.
//LinkedList provides List methods as well as special methods like addFirst(), addLast(), getFirst(), getLast(), removeFirst(), and removeLast()
public class TestLinkList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		l.add("Ram dulare");
		l.add(1, "Tum rakhware");
		l.add(2, "Hunuman");
		l.add("Jay");
		System.out.println(l);

		LinkedList l2 = new LinkedList();
		l2.add(12);
		l2.add("Hunuman");
		l2.add("Karuna");
		System.out.println(l2);

//		l.addAll(l2);
//		System.out.println(l);
//
//		l.addFirst("Anamika");
//		System.out.println(l);
//
//		l.addLast(28);
//		System.out.println(l);
//		
//		System.out.println(l.get(2));
//
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
//
//		System.out.println(l);
//		System.out.println(l.removeFirst());
//		System.out.println(l);
//		System.out.println(l.removeLast());
//		System.out.println(l);
////		
	l.retainAll(l2);
		System.out.println(l);

	}
}
