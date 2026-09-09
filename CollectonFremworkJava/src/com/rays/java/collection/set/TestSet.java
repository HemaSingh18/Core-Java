package com.rays.java.collection.set;

import java.util.HashSet;
import java.util.Set;

//Set is a Interface
//Child :- HashSet(Class),SortedSet(Interface)--------------->TreeSet(Class)
//Set contain only unique elements;
//Set contain only one null value;
//Order of set is not define
//Set cannot allow duplicate value
public class TestSet {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add("Ram");
		s.add("Shyam");
		s.add(25);
		s.add("Ankita");
		s.add("Ankita");
		//s.add(null);
		//s.add(null);
		
		System.out.println(s);
				
	}

}
