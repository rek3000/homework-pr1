import java.util.Scanner;
public class App {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int result = 0;

		result = count(str) + caseCheck(str) + digitCheck(str) + nonAlpha(str);

		System.out.println("The strength of password: " + result);
	}
	public static int count(String str) {
		if (str.length() >= 8 && str.length() <= 12) {
			return 1;
		} else if (str.length() > 12) {
			return 2;
		} else {
			return 0;
		}
	}

	public static int caseCheck(String str) {
		int i = 0;
		int point = 0;
		for (i = 0; i < str.length(); ++i) {
		if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				++point;
				break;
			}
		}

		for (i = 0; i < str.length(); ++i) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				++point;
				break;
			}
		}

		return point;
	}

	public static int digitCheck(String str) {
		for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				return 1;
			}	
		}
		return 0;
	}

	public static int nonAlpha(String str) {
		for (int i = 0; i< str.length(); i++) {
		if ((str.charAt(i) >= '!' && str.charAt(i) <= '/') || 
				(str.charAt(i) >= '[' && str.charAt(i) <= '`'))
		{
				return 1;
		}	
	}
		return 0;
	}
}
