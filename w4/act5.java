package w4;

import java.util.*;
public class Act5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        sc.close();
        
        int b = 0;

        if (a == 0) {
            System.out.println("The number is not a power of 2!");
        }
     
        while (a != 1) {
        b = a % 2;
        a = a / 2;
        }
        if (a == 1 && b == 0) {
            System.out.println("The number is a power of 2!");
        } else {
            System.out.println("The number is not a power of 2!");
        }
}
}
