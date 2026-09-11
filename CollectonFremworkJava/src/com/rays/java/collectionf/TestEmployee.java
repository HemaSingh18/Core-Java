package com.rays.java.collectionf;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	
public static void main(String[] args) {
	
	Employee e = new Employee(1," ram ",5000);
	Employee e1 = new Employee(2," priya ",400);
	Employee e2 = new Employee(3," karan ",500);
	Employee e3 = new Employee(4," rohan ",8000);
	Employee e4 = new Employee(5," radha ",10000);
	
	ArrayList list = new ArrayList();
	
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
	System.out.println(list);
	
	for(Object o: list) {
		System.out.println(o);
		
	}
	System.out.println("------------------------------");
	
	Iterator i = list.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
	}
  }
}
