package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSorting {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList ();
		
		list.add('d');
		list.add('b');
		list.add('c');
		list.add('a');
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}
