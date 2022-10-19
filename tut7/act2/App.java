public class App {
	public static void main (String[] args) {

	int a = 2;
	System.out.println(convertBin(a));

 }

	public static int convertBin(int decimal) {
		if (decimal == 0) {
			return 0;
		} else {
			return (decimal % 2 + 10 * convertBin(decimal / 2));
		}
	}
}
