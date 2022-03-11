package module27;

public class NotHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[4];
		try {
			System.out.println("Before exception is generated");
			nums[7] = 10;
			System.out.println("this won't be displayed");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out-of-bound!");
		}
		
	}

}
