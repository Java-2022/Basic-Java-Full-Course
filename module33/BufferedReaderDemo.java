package module33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		int rno,age;
		String sname;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Roll Number:");
		rno = Integer.parseInt(input.readLine());
		System.out.println("Enter Student Name:");
		sname = input.readLine();
		System.out.println("Enter Age:");
		age = Integer.parseInt(input.readLine());
		System.out.println("Roll Number \t Name\tAge");
		System.out.println(rno + "\t\t\t" + sname + "\t\t" + age);
		input.close();

	}
}
