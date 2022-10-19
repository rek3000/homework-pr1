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
	int[] out = new int[10];
	System.out.println(Arrays.toString(out));

	for (int i = 0; i < def.length; i++) {
		if ((def[i] % 10) >= 0 && (def[i] % 10) <= 9) {
			out[def[i] % 10]++;
		}
	}

	System.out.println(Arrays.toString(out));
 }
}
