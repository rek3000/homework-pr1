package w5;

import java.util.*;
import java.lang.Math;
public class Rev1 {
    public static void main(String[] args) {
        
    }

    public static void sumEven(int a) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumSquare(int sum) {
        for (int i = 0; i < 100; i++) {
            if (Math.pow(i,2) < 100) {
                sum += Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }

    public static void power(int sum, double[] powerOfTwo) {
        for (int i = 0; i < 100; i++) {
            powerOfTwo = new double[10];
            if (Math.pow(i,2) < 220) {
                powerOfTwo[i] = Math.pow(i,2);
            }
        }
        System.out.println(Arrays.toString(powerOfTwo));
    }

    public static void sumOddab(int a, int b, int sum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter another number: ");
        b = sc.nextInt();
        sc.close();

        if (a < b) {
            for (int i = a; i <= b; i += 2) {
                sum += i;
            }
            System.out.println(sum);
        }

        if (a > b) {
            for (int i = b; i <= a; i += 2) {
                sum += i;
            }
            System.out.println(sum);
        }
    }

    public static void sumOdd(int sum, int num, int[] numArr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        sc.close();
        int length = String.valueOf(num).length();
        
        for (int i = 0; i < length; i++) {
            int remainder = num % 10;
            num = num / 10;
            numArr[numArr.length - i - 1] = remainder;
        }

        for (int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i] % 2 != 0) {
                sum += numArr[i];
            }
        }
        System.out.println(sum);
    }
}
