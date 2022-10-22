package w9;

import java.util.*;
public class Act2 {
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
        
        shiftRight(arrLength, digits);
    }

    public static void shiftRight(int arrLength, int[] digits) {
        int[] newArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            newArr[i] = digits[i];
        }

        newArr[0] = digits[arrLength - 1];
        for (int i = 1; i < arrLength; i++) {
            newArr[i] = digits[i - 1];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
