package exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("FileList/ByteWrtie.txt");
		FileInputStream in = new FileInputStream("FileList/ByteWrtie.txt");
		
		byte bytearr[]= {45,56,48,67,65,58};
		out.write(bytearr);
		int i;
		do {
			i=in.read();
			if(i!=-1)
			{
			System.out.write(i);
			System.out.println();
			}
		}while(i!=-1);
		
		out.close();
		in.close();
		
		
		
		

	}

}
