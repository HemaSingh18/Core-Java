package com.rays.java.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue q = new ArrayDeque();
		q.offer("Ram");
		q.offer("Shyam");
		q.offer("Neha");
		
		System.out.println(q);
	}
}
