package assignment;

import java.io.*;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

public class ConsoleInputBufferDemo {
	public static void main(String[] args) throws IOException {
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.print("Enter Student Name:");
		String sn = br.readLine();
		System.out.print("Enter Address:");
		String sd = br.readLine();
		System.out.print("Enter age:");
		int age = br.read();
		System.out.println("Student Information");
		System.out.println("Name\t\tAddress\tAge");
		System.out.println(sn + "\t" + sd + "\t" + age);
	br.close();
	}
}
