package w3;

import java.util.*;
public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        float real = sc.nextFloat();
        sc.close();

        if (real == 0) {
            System.out.println("The number is zero");
        }

        if (Math.abs(real) < 1) {
            if (real < 0) {
                System.out.println("A small negative number");
            } else if (real > 0) {
                System.out.println("A small positive number");
            }
        }

        if (Math.abs(real) > 1) {
            if (real < 0) {
                System.out.println("A large negative number");
            } else if (real > 0) {
                System.out.println("A large positive number");
            }
        }
    }
}
