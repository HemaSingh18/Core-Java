package com.rays.java.io.stream;

import java.io.FileReader;
import java.io.IOException;

//FileReader is used to read character data from a file.
public class ReadTestFile {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("C://Rayssoftware//IO//Test.txt");

		int i = file.read(); // It reads one character at a time.
		while (i != -1) { // -1 So the loop stops.

			System.out.println((char) i + "=" + i);
			i = file.read();
		}
		file.close();
	}
}
