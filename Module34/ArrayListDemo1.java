package Exe;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10;i++)
		{
			list.add(i);
		}
System.out.println("ArrayList Size="+ list.size());
System.out.println(list);
// use iterator
Iterator<Integer> itr =list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
list.add(10, 11);
System.out.println("ArrayList Size="+ list.size());
System.out.println(list);
list.remove(4);
System.out.println("ArrayList Size="+ list.size());
System.out.println(list);
list.add(0, 12);
System.out.println("ArrayList Size="+ list.size());
System.out.println(list);
	}

}
