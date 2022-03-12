package module28;

public class StackObject {
	public static void main(String[] args){
		int number=1;
		Stack s=new Stack();
		while(!s.full()) {
	
			s.push(number);
			System.out.println("Number Pushed is "+ number);
			number++;
		}
		System.out.println();
		
		while(!s.empty())
		{
			number =s.pop();
			System.out.println("Number popped is " + number);
			
		}
		
	}
    
}
