package module27;

import java.io.IOException;
import java.util.Scanner;

public class IoException {
	static char CharInput() throws IOException 
	{
		return (char) System.in.read();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 try {
		System.out.println("Character is:"+CharInput());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
