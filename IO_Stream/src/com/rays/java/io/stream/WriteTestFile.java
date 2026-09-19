package com.rays.java.io.stream;

import java.io.FileWriter;
import java.io.IOException;

//FileWriter is used to write character data into a file.
public class WriteTestFile {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C://Rayssoftware//IO//Test.txt", true);

		file.write("Hello Rays"); // Writes data into the file.

		System.out.println("text data write succesfully...");
		file.close(); // Closes the file.
	}
}
