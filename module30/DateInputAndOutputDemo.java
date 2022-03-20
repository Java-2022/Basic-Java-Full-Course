package exe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateInputAndOutputDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		DataOutputStream out = new DataOutputStream(new FileOutputStream("writedata.txt"));
		DataInputStream in=new DataInputStream(new FileInputStream("writedata.txt"));
		out.writeInt(34);
		out.writeChar('A');
		out.writeDouble(89);
		
		//int a=in.readInt();
		System.out.println(in.readInt());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
		out.close();
		in.close();
	}

}
