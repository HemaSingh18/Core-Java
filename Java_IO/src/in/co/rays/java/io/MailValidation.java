package in.co.rays.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MailValidation {

	public static void main(String[] args) throws IOException {

		FileReader source = new FileReader("C:\\Rayssoftware\\IO\\Email.txt");
		
		FileWriter target = new FileWriter("C:\\Rayssoftware\\IO\\ValidEmail.txt");
		FileWriter target1 = new FileWriter("C:\\Rayssoftware\\IO\\icloudEmail.txt");
		FileWriter target2 = new FileWriter("C:\\Rayssoftware\\IO\\Yahoo.txt");

		BufferedReader br = new BufferedReader(source);
		
		BufferedWriter bw = new BufferedWriter(target);
		BufferedWriter bw1 = new BufferedWriter(target1);
		BufferedWriter bw2 = new BufferedWriter(target2);

		String email = br.readLine();

		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
			//icloud
			else if (email.endsWith("@icloud.com")) {
				System.out.println(email);
				bw1.write(email);
				bw1.newLine();
			}
			else if(email.endsWith("@Yahoo.com")) {
				System.out.println(email);
				bw2.write(email);
				bw2.newLine();
			}
			email = br.readLine();
		}
		br.close();
		bw.close();
		bw1.close();
		bw2.close();

	}
}
