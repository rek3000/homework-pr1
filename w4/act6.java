package w4;

import java.util.*;
public class Act6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        sc.close();

        // num = Math.sqrt(num);
        // System.out.println("The square root of it is " + num);

        double temp;
        double sqr = num / 2;
        
        // formula: sqrt(n+1) = ((sqrt(n) + (n/sqrt(n))/2);

        do {
            temp = sqr;
            sqr = ( num / temp + temp) / 2;
        } while (sqr != temp);

        System.out.println("The square root of " + num + " is " + sqr);
    }
}
