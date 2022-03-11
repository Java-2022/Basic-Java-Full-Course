package module27;

public class DivideByZero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume[]= {21,20,24,35,37};
		int deno[]= {2,0,4,0,5};
		for(int i=0; i<nume.length;i++)
		{
			try {
			System.out.println(nume[i]+" /" +deno[i]+ "="+ nume[i]/deno[i]);
			}catch(ArithmeticException e){
				System.out.println("Can't divide by Zero!");
				
			}
			}
		}
	
	}


