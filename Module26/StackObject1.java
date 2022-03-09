package encapsulation;

public class StackObject1 {
	public static void main(String[] args) {
		int number=1;
		Stack1 s=new Stack1();
		while(s.push(number)) {
			System.out.println("Number Pushed is "+ number);
			number++;
		}
		System.out.println();
		// return true empty
		//return false not empty
		boolean thereAreItems=true;
		while(thereAreItems)
		{
			number =s.pop();
			if(number!=-1)
				System.out.println("Number popped is " + number);
			else
				thereAreItems=false;
				
			
		}
		
	}
    
}
