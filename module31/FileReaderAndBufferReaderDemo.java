package assignment;
import java.io.*;

public class FileReaderAndBufferReaderDemo {
public static void main(String[] args) throws IOException {
String s;

BufferedReader br = new BufferedReader(new FileReader("FileList/test.txt"));
while((s=br.readLine())!=null)
{
System.out.println(s);
}

br.close();
}

}
