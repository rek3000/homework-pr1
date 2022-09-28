package w4;

import java.util.*;
public class Act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
     
        int a = 1;
        // num = 3
        for ( int i = 1; i <= num; i++) {
            a = a * i; // a = 1*1; a = 1*2; a = 2*3
        }
        System.out.println("The factorial of it is " + a);
    }
}
