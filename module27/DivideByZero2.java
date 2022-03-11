package module27;

public class DivideByZero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume[]= {21,20,24,35,37,45,50,60};
		int deno[]= {2,0,4,0,5};
		for(int i=0; i<nume.length;i++)
		{
			try {
			System.out.println(nume[i]+" /" +deno[i]+ "="+ nume[i]/deno[i]);
			}
			catch(ArithmeticException ex){ 
				System.out.println("Can't divide by Zero!");
				
			}
			catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("No matching element found");
			}
			
			}
		}
	
	}


