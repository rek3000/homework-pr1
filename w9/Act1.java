package w9;

import java.util.*;
public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int arrLength = sc.nextInt();
        int[] digits = new int[arrLength];
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < arrLength; i++) {
            digits[i] = sc.nextInt();
        }
        sc.close();
        countLastDigit(digits);
    }

    public static void countLastDigit(int[] digits) {
        int[] counts = new int[10];
        for (int i = 0; i < digits.length; i++) {
            counts[digits[i] % 10]++;
        }
        System.out.println(Arrays.toString(counts));
    }
}
