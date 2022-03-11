package module27;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nume[]= {21,20,24,35,37,45,50,60};
		int deno[]= {2,0,4,0,5};
		for(int i=0; i<nume.length;i++)
		{
			try {
				if((nume[i]%deno[i])!=0)
					throw new NonIntResultException(nume[i], deno[i]);
			System.out.println(nume[i]+" /" +deno[i]+ "="+ nume[i]/deno[i]);
			}
			catch(ArithmeticException exe){ 
				System.out.println("Can't divide by Zero!");
				
			}
			catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("No matching element found");
			}
			catch(NonIntResultException exe) {
				System.out.println(exe);
			}
			}
		}
	
	}


