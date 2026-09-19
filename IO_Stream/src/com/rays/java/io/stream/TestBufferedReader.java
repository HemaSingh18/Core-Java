package com.rays.java.io.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//File → BufferedReader → Java Program
//It is especially useful when you want to read one complete line at a time.
public class TestBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("c://rayssoftware//IO//test.text"));
		
		String line = br.readLine();
		
		while(line !=null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
