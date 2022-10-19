import java.util.*;
public class App {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array: ");
		int n = input.nextInt();
		int[] list = new int[n];

		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			list[i] = input.nextInt();	
		}

		count(list);
	}

	public static void count(int[] list) {	
		int[] out = new int[10];
		System.out.println(Arrays.toString(out));

		for (int i = 0; i < list.length; i++) {
		out[list[i] % 10]++;
		}

		System.out.println(Arrays.toString(out));
	}
}
