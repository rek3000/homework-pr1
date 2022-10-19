import java.util.*;
public class App {
	public static void main (String[] args) {
	int[] def = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};

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
