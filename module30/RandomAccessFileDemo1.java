package exe;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Double dnums[]= {45.6,67.5,34.2,12.2,45.5};
		RandomAccessFile  rf= new RandomAccessFile("dfile.txt", "rw");
		for(double d :dnums)
			rf.writeDouble(d);
		/*
		 * rf.seek(0); System.out.println(rf.readDouble()); rf.seek(16);
		 * System.out.println(rf.readDouble()); rf.seek(32);
		 * System.out.println(rf.readDouble());
		 */
		for(int i=0; i<dnums.length; i++)
		{
			rf.seek(i*8);
			System.out.println(rf.readDouble());
			
		}
		
		System.out.println("Length="+rf.length());
		rf.close();
	}

}
