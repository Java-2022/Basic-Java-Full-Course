package module33;

import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int rno,age;
		String sname;
		Scanner input =new Scanner(System.in);
		
					//input.nextLine();
			//	input.skip("\r\n");//"enter"/"return" key on the keyboard.
		System.out.println("Enter Roll Number:");
		rno=input.nextInt();
		//input.nextLine();
		input.skip("\r\n");
		System.out.println("Enter Student Name:");
		sname=input.nextLine();
		System.out.println("Enter Age:");
		age=input.nextInt();
		System.out.println("Roll Number \t Name\tAge");
		System.out.println(rno+ "\t\t\t"+sname+"\t\t"+age);
		}

}
