package com.rays.java.collection.list;

import java.util.ArrayList;

//ArrayList ek class hai jo List interface ko implement karti hai.
public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();

		arr.add("Ram");              //Element add karna
		arr.add(1,"Kavita");          //Specific position par add  
		arr.add(2,"Neelam");
		arr.add(3,"Neha");
		System.out.println(arr);
		
	  //Element get karna
		System.out.println(arr.get(0));
		
		//Element update karna
		System.out.println(arr.set(0, "Hema"));
		System.out.println(arr);
		
		//Index se remove
		arr.remove(0);
		System.out.println(arr);
		
		//Object/value remove
		arr.remove("Neelam");
		System.out.println(arr);
		
		//Total elements
		System.out.println(arr.size());
		
		//Empty hai ya nahi return boolean
		System.out.println(arr.isEmpty());
		
		//First index find
		System.out.println(arr.indexOf("Hema"));
		
		//Last index find
		System.out.println(arr.lastIndexOf("neha"));
		
		System.out.println(arr.toString());
		
		System.out.println(arr.removeAll(arr));
		System.out.println(arr);
	}
}
