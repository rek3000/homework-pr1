package w2;
import java.util.Scanner;
public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of VND: ");  
		int vnd = sc.nextInt();
        sc.close();
        int rate = 207, jpy = vnd / rate;
        System.out.println(vnd + " VND is roughly " + jpy + " JPY.");
    }
}
