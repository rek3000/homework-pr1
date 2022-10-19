import java.util.Scanner;
public class App {
	static int last = 0;
	public static void main (String[] args) {
		int a = 10;
		int pos = 1;
		for (int i = 0; i < a; i++) {
			System.out.print(fibonacci(i) +" ");
		}
		System.out.println();
		System.out.print(fibonacci(pos - 1) +" ");
	}
	public static int fibonacci(int num) {
		if (num <= 1) {
			return num;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
