package com.rays.java.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSorted {
	// It store unique elements in sorted(asc)order
	// null generally not allowed
	public static void main(String[] args) {

		SortedSet ss = new TreeSet();
//		ss.add("Radha");
//		ss.add("Kanha");
//		ss.add("Shita");
//		ss.add(12);
//		System.out.println(ss); // Exception in thread "main" java.lang.ClassCastException: runtime Exception
		// Because all elements should be of same datatype if first is character then
		// rest
		// are also character type // TreeSet slow hai HashSet se
		//element null rahega tab Exception in thread "main" java.lang.NullPointerException 

		ss.add('b');
		ss.add('c');
		ss.add('a');
		ss.add('r');
		ss.add('d');
		ss.add('e');
		ss.add('b');
		//ss.add(null);
		//ss.add(null);
		System.out.println(ss);
	}

}
