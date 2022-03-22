package assignment;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter line of text.");
		System.out.println("Enter stop to quit.");
		FileWriter fw = new FileWriter("Files/test.txt");
		do {
			System.out.print(":");
			str = br.readLine();
			fw.write(str);
		} while (!str.equals("stop"));
	}
}
