import java.io.IOException;

public class SwitchExample {

	public static void main(String[] args) throws IOException {
		// test vowel or not
		char ch;
		System.out.println("Enter Character:");
		ch = (char) System.in.read();
		switch (ch) {
		case 'a':
			System.out.println("It is Vowel");
			System.out.println("It is Vowel");
			System.out.println("It is Vowel");
			break;
		case 'e':
			System.out.println("It is Vowel");
			break;
		case 'i':
			System.out.println("It is Vowel");
			break;
		case 'o':
			System.out.println("It is Vowel");
			break;
		case 'u':
			System.out.println("It is Vowel");
			break;
		default:
			System.out.println("It is not Vowel");

		}

	}

}
