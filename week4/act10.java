package week4;
import java.util.Scanner;
public class act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int temp = input;
        for (int i = 0; i < input; i++) {
            temp = (input - 1);
        }
        System.out.print(input);
    }
}
