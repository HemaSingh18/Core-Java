package com.rays.java.io.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Java Program → BufferedWriter → File
//BufferedWriter is used to write text efficiently into a file.
public class TestBufferedWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter file = new BufferedWriter(new FileWriter("c://rayssoftware//IO//test.text"));
		file.write("public class HelloTest {");	
		file.newLine();
		file.write(" public static void main(String []args){");
		file.newLine();
		file.write(" int a=10");
		file.newLine();
		file.write(" int b=20");
		file.newLine();
		file.write(" int c = a+b");
		file.newLine();
		file.write("System.out.println(c)");
		file.newLine();
		
		System.out.println("Java file write sucssefully... ");
		file.close();
	}
}
