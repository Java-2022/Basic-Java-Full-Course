package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperClassDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;
		double sum = 0.0;
		double avg = 0, dnum;
		System.out.print("How many numbers will you enter:");
		str = br.readLine();
		n = Integer.parseInt(str);
		//n=Integer.parseInt(br.readLine());
		System.out.println("Enter " + n + " values");
		for (int i = 0; i < n; i++) {
			System.out.print(":");
			str = br.readLine();
			dnum = Double.parseDouble(str);
			//dnum=Double.parseDouble(br.readLine());
			sum += dnum;

		}
		avg = sum / n;
		System.out.println("Average is " + avg);
		br.close();
	}
}
