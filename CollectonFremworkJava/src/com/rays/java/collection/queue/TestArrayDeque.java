package com.rays.java.collection.queue;

import java.util.ArrayDeque;

//ArrayDeque me null element add nahi kar sakte.
//double-ended queue (Deque). Isme hum front aur rear dono sides se element add/remove kar sakte hain.
//ArrayDeque is a class which implement deque
//Duplicate element allowed hai
//Maintain Order
//method--addFirst(),addLast(),removeFirst(),removeLast(),peekFirst(),peekLast()
public class TestArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque a = new ArrayDeque();
		a.offer(27);
		a.offerFirst("Karuna");
		a.offerLast("Rays");
		a.offer("Hema");
		a.offerFirst("Chinmay");
		
		a.push(23);  //
		
		System.out.println(a);
		
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
		
		System.out.println(a.poll()); //Remove first element
		System.out.println(a.pollFirst());   //remove first element
		System.out.println(a.pollLast());   //remove last element
		System.out.println(a);
		System.out.println(a.pop());  //remove 
		System.out.println(a.size());
		
		System.out.println(a);
		System.out.println(a.isEmpty()); //return boolean 
		System.out.println(a.clone());  // object duplicate copy print karna
	    
		a.clear();                     // clear data
	    System.out.println(a);
		
		
		
	}
}
