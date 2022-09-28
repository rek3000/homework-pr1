package w4;

import java.util.*;
public class Act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String original = sc.nextLine();
        sc.close();
        
        String reverse = new StringBuffer(original).reverse().toString();
        System.out.println(reverse);
        if (reverse.equals(original)) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }
    }
}
