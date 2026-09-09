package com.rays.java.collection.list;

import java.util.Stack;

//child of vactor class
//Stack ek data structure hai jo LIFO principle follow karta hai.
//Stack class provides methods like push(), pop(), and peek() to add, remove, and view the top element.

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		for (char c = 'a'; c <= 'z'; c++) {

			s.push(c); // Stack ke top par element add karta hai.
		}
		System.out.println("Stack " + s);

		System.out.println(s.peek()); // Top element ko sirf dekhta hai, remove nahi karta.
		System.out.println("Stack " + s);

		System.out.println(s.pop()); // Top element ko remove aur return karta hai.
		System.out.println("Stack " + s);
	}

}
