package week4;
import java.util.Scanner;
public class act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        for (int i = 1; i <= input.length(); i++) {
            System.out.println(input.substring((input.length() + i - 2), (input.length() + i)));

        }
    }
}
