package module27;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numerator =ပိုင္းေ�?�
		//denominator=ပိုင္းေျ�?
		int nume[]= {21,20,24,35,37};
		int deno[]= {2,0,4,0,5};
		for(int i=0; i<nume.length;i++)
		{
			System.out.println(nume[i]+" /" +deno[i]+ "="+ nume[i]/deno[i]);
		}

	}

}
