package exe;

import java.io.PrintWriter;

public class PrintWriterConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw= new PrintWriter(System.out);
		int a=34, b=64;
		float f1=4.5F, f2= 2.3F;
		boolean flag=true;
		char ch='a';
		String myname="John Smith";
		String fname="Floral";
		pw.println(" a + b ="+(a+b));
		pw.println("f1 + f2 ="+ (f1+f2));
		pw.println(flag);
		pw.println(ch);
		pw.printf("My name is %s. My father name is %s",myname,fname);
		pw.flush();
		pw.close();

	}

}
