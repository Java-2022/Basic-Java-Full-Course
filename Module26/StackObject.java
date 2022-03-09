package encapsulation;

public class StackObject {
	public static void main(String[] args) {
		int number=1;
		Stack s=new Stack();
		while(!s.full()) {
			s.push(number);
			System.out.println("Number Pushed is "+ number);
			number++;
		}
		System.out.println();
		// return true empty
		//return false not empty
		while(!s.empty())
		{
			number =s.pop();
			System.out.println("Number popped is " + number);
			
		}
		
	}
    
}
