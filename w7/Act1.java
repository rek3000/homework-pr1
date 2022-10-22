package w7;

import java.util.*;
public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number x: ");
        int x = sc.nextInt();
        System.out.println("Enter number y: ");
        int y = sc.nextInt();
        sc.close();
        System.out.println("The GCD of two numbers is " + findGCD(x, y));
    }

    static int findGCD(int x, int y) {
        int c = 0, a, b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;
        
        c = b;
        if (a == 0 || b == 0) {
            c = (x > y) ? x : y;
            return c;
        } else {
            while (a % b != 0)  {  
                c = a % b;  
                a = b;  
                b = c;  
            }  
            return c; 
        }
    }
}
