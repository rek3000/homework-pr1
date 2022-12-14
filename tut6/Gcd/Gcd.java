/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gcd;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A (A > 0): ");
		int a = input.nextInt();
		System.out.print("Enter B (B > 0): ");
		int b = input.nextInt();
		input.close();

		int temp = 0;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			temp = a;
			a = b;
			b = temp % b;
		}

		System.out.println("The GCD is " + a);
	}
}
