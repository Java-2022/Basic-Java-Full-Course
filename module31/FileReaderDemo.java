package assignment;

import java.io.*;
public class FileReaderDemo {

public static void main(String[] args) throws IOException {
FileReader fr=new FileReader("FileList/test.txt");

int i;    
        while((i = fr.read()) != -1) {
         System.out.print((char)i);
        }
fr.close();
}

}
