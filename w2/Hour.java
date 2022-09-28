package w2;
import java.util.Scanner;
public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int a = sc.nextInt();
        sc.close();
        int h = a / 3600;
        int m = (a % 3600) / 60;
        int s = a % 60;
        System.out.println(h + "h, " + m + "m, " + s + "s");
}
}