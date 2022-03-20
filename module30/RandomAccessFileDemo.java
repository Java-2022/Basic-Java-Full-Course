package exe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		int num=34;
		float fnum=56.9F;
		char ch='B';
		RandomAccessFile  rf= new RandomAccessFile("rfile.txt", "rw");
		rf.writeInt(num);
		rf.writeFloat(fnum);
		rf.writeChar(ch);
		rf.seek(0);
		System.out.println(rf.readInt());
		System.out.println(rf.readFloat());
		System.out.println(rf.readChar());
		System.out.println(rf.length());
		
		rf.close();

	}

}
