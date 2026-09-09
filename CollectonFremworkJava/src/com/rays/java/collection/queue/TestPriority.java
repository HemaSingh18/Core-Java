package com.rays.java.collection.queue;

import java.util.PriorityQueue;

public class TestPriority {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		
		p.offer(2);
		p.offer(4);
		p.offer(6);
		p.offer(8);
//		p.offer('a'); //Exception in thread "main" java.lang.ClassCastException:
//		p.offer("Ram");
		System.out.println(p);
		
		System.out.println(p.peek());
		
		System.out.println(p.poll()); //First Element Remove karta hai
		System.out.println(p); 
		
	}
}
