package exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSteamDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileInputStream in;
		int i;
		in= new FileInputStream("write.txt");
		do {
					i=in.read();
					if(i!=-1)
					{
					System.out.write(i);
					System.out.write('\n');
					//System.out.println(i);
					}
				//	System.out.println(i);
					//56
					//89
					//68
				//	-1
		}while(i!=-1);
		in.close();
	}

}
