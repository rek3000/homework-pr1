package w2;
import java.util.Scanner;
public class Act3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");  
		int firstNum = sc.nextInt();  
		System.out.println("Enter second number: ");  
		int secondNum = sc.nextInt();  
		sc.close();

		int firstNumDigit = firstNum % 10;
		int secondNumDigit = secondNum % 10;
		
		if (firstNumDigit == secondNumDigit) {
			System.out.println("Two numbers " + firstNum + " and " + secondNum + " have the same last digit.");
		} else {
			System.out.println("Two numbers " + firstNum + " and " + secondNum + " have different last digit.");
		}
	}
}
