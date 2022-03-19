package exe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSteamDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream("write.txt");
		out.write(56);
		out.write(89);
		out.write(68);
		out.close();

	}

}
