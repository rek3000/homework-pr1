package w5;

import java.util.*;
public class Rev4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        int length = sc.nextInt();
        sc.close();

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int k = length + 1; k <= length * 2; k++ ) {
                if (k == length + 1 || k == length * 2 || i == 1 || i == length) {
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            System.out.println(" ");
        }
    }
}
