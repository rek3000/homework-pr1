import java.util.Scanner;
public class App {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		reverse(str, 0);

 }
	public static void reverse(String str, int start) {
		if (start < str.length() - 1) {
			reverse(str, start + 1);
		} 
			System.out.print(str.charAt(start));
	}
}
