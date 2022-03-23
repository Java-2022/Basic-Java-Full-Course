package exe;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterFileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter fileWrite= new PrintWriter("write.txt"); // for write to file
		PrintWriter consoleWrite= new PrintWriter(System.out); // for write to console
		
		for(int count=1; count<=100;count++)
		{
			consoleWrite.println("Hello "+ count);  //write console
			fileWrite.println("Hello "+ count); // write
			
		}
		fileWrite.flush();
		consoleWrite.flush();
		consoleWrite.close();
		fileWrite.close();

	}

}
