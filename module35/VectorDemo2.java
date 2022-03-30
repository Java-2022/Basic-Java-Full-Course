package exe;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector<String> vv= new Vector<String>();
		vv.add("Java");
		vv.add("Ruby");
		vv.add("PHP");
		vv.add("HTML");
		vv.add("JavaScript");
		vv.add("Python");
		System.out.println(vv.size());
		System.out.println("Before Sorting");
		System.out.println(vv);
		Collections.sort(vv);
		System.out.println("After Sorting");
		System.out.println(vv);
		if(vv.contains("PHP"))
			System.out.println("Vector contains PHP ");
		vv.remove(2);
		System.out.println("After Remove");
		System.out.println(vv);
		vv.clear();
		System.out.println("After Clear");
		System.out.println(vv);
		
		
		
	}
	}


