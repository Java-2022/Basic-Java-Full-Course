package Exe;

import java.util.ArrayList;

public class ArrayListDemo3 {
	String empName, position;
	int salary;
	
	

	public ArrayListDemo3(String empName, String position, int salary) {
		this.empName = empName;
		this.position = position;
		this.salary = salary;
	}



	public static void main(String[] args) {
		ArrayListDemo3 obj1= new ArrayListDemo3("Aye Aye", "HR", 34000);
		ArrayListDemo3 obj2= new ArrayListDemo3("Zaw Zaw","Manager",245000);
		ArrayListDemo3  obj3=new ArrayListDemo3("Kyaw Kyaw", "Driver",23000);
		
	// create ArrayList
		ArrayList<ArrayListDemo3> list =new ArrayList<ArrayListDemo3>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		System.out.println(list.size());
		System.out.println(list);
		for(ArrayListDemo3 emp:list)
			System.out.println(emp.empName+"\t"+emp.position+"\t"+emp.salary);

	}

}
