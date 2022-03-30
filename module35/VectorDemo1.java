package exe;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
	Vector<Integer> v = new Vector<Integer>();
	System.out.println("Size="+ v.size());
	System.out.println("Capacity="+v.capacity());
	v.add(23);
	v.add(12);
	System.out.println("Size="+ v.size());
	System.out.println("Capacity="+v.capacity());
	v.add(23);
	v.add(12);
	v.add(45);
	v.add(11);
	v.add(1);
	System.out.println("Before Sorting:");
	System.out.println(v);
	Collections.sort(v);
	System.out.println("After Ascending:");
	System.out.println(v);
	Collections.sort(v, Collections.reverseOrder());
	System.out.println("After decending order:");
	System.out.println(v);
	for(Integer item:v)
		System.out.println(item);
	
	
	}

}
