package Exe;

import java.util.ArrayList;
import java.util.Scanner;

public class ArralyListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		for(int i=1 ;i<=5;i++)
		{
			System.out.println("Student "+i+" Name :");
			list.add(input.nextLine());
		}
		System.out.println(list.size());
		System.out.println(list);
		for(String sname:list)
			System.out.println(sname);
	}

}
