package in.co.rays.java.io;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int input
		int intValue;
		System.out.println("Please Enter any Integer Number....");
		intValue = sc.nextInt();
		System.out.println("Entered Integer = " + intValue);

		// float input
		float floatValue;
		System.out.println("Please Enter any Float Number...");
		floatValue = sc.nextFloat();
		System.out.println("Entered Float = " + floatValue);

		// Long input
		long longValue;
		System.out.println("Please Enter any Long Number....");
		longValue = sc.nextLong();
		System.out.println("Entered long = " + longValue);

		// double input
		double doubleValue;
		System.out.println("Please Enter any Double Number....");
		doubleValue = sc.nextDouble();
		System.out.println("Entered Double = " + doubleValue);
		
		sc.nextLine(); // buffer clear (very important)
		// string input (full line)
		String strValue;
		System.out.println("Please Enter any String Value....");
		strValue = sc.nextLine();
		System.out.println(" Entered String Value...." + strValue);
	
		// string input (single word)
		String wordValue;
		System.out.println("Please Enter any Single Word....");
		wordValue = sc.next();
		System.out.println("Entered Word = " + wordValue);

		sc.close();
	}
}

