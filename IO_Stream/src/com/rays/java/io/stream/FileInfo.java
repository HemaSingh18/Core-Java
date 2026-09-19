package com.rays.java.io.stream;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		File file = new File("C://Rayssoftware//IO//Test.txt");
		
		if(file.exists()) {
			System.out.println("file name :"+file.getName());
			System.out.println("file path :"+file.getPath());
			
			System.out.println("Access Permission");
			System.out.println("writable "+file.canWrite());
			System.out.println("readable "+file.canRead());
			
			System.out.println("check if it is a folder/directory or a file");
			System.out.println("is file :"+file.isFile());
			System.out.println("is directory/folder :"+file.isDirectory());
			
			System.out.println("Last modified date of file, folder/directory");
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println(""+file.lastModified());
			System.out.println(" last Modified Date :"+lastModifiedDate);
			System.out.println("File Length :"+file.length());
		}else {
			System.out.println("File not found..");
		}
	}
}
