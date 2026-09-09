package com.rays.java.collection.list;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Iterator;

//traverse collection elements one by one. Its main methods are hasNext(), next(), and remove().
public class TestIterator {
	public static void main(String[] args) {

		ArrayList it = new ArrayList<>();

		it.add("Ram");
		it.add("Shyam");
		it.add("NanadLala");
		it.add(1, "Shiva");

		Iterator itr = it.iterator();

		while (itr.hasNext()) // true → next element available, false → next element nahi hai
		{

			// itr.remove(); //Exception in thread "main" java.lang.IllegalStateException

			// System.out.println(itr.next()); // Next element ko return karta hai. ya print
			// karana
			Object names = itr.next();

			if (names.equals("Ram")) {
				itr.remove();
			}
		}

		System.out.println(it);
	}

}
