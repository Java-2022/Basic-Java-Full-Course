package module27;

public class NonIntResultException extends Exception{
	int a,b;
	public NonIntResultException(int i, int j) {
		// TODO Auto-generated constructor stub
		a=i;
		b=j;
	}
	public String toString()
	{
		return "Result of "+a+" / "+b+" is non-integer";
	}

}
