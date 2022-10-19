import java.util.*;
public class App {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array: ");
		int n = input.nextInt();
		int[] def = new int[n];

		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			def[i] = input.nextInt();	
		}

		count(def);
	}

	public static void count(int[] def) {	
		int[] out = new int[10];
		System.out.println(Arrays.toString(out));

		for (int i = 0; i < def.length; i++) {
		out[def[i] % 10]++;
		}

		System.out.println(Arrays.toString(out));
	}
}
