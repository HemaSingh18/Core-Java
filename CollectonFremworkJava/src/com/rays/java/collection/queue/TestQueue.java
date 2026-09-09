package com.rays.java.collection.queue;

import java.util.ArrayDeque;

import java.util.Queue;

//Order maintain karta hai
public class TestQueue {

	public static void main(String[] args) {
		Queue q = new ArrayDeque();
		q.offer("Ram");
		q.offer("Shyam"); // add element
		q.offer("Neha");

		System.out.println(q);
		System.out.println(q.add(25)); // kisi bhi type ka value store kar sakte hai
		System.out.println(q);
		;

		Queue q1 = new ArrayDeque();
		q1.offer(50);
		q1.offer("Ram");
		System.out.println(q);

		System.out.println(q.contains(25)); // Membership check karta hai boolean return karta hai

		System.out.println(q.containsAll(q1)); // Collection q and q1 add hai ya ni check karta hai

		System.out.println(q.addAll(q1)); //Collection ko add karta hai retun true ya false deta hai
		System.out.println(q);
		
		System.out.println(q.peek());// First in first out follow karta hai first value ko print karayega
		
		System.out.println(q.poll()); //remove first element
		System.out.println(q);
		
		System.out.println(q.isEmpty()); //Collection check karta hai ki collection hai ya nahi collection nahi hoga tab true return karega
	}
}
