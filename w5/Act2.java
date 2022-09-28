package w5;

import java.util.*;
public class Act2 {

    
    public static void mainA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i) + " " );
            }
        }
        System.out.println();
    }

    public static void mainB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
    
    public static void mainC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        System.out.println(str.replaceAll("[AaEeUuOoIi]", "_"));
    }

    public static void mainD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        int count = 0;
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
            || str.charAt(i) == 'e'
            || str.charAt(i) == 'i'
            || str.charAt(i) == 'o'
            || str.charAt(i) == 'u') {
                count = count + 1;
            }
        }
        System.out.println("The number of vowels in the string: " + count);
    }

    public static void mainE() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        
        str.toLowerCase();
        System.out.println("The positions of all vowels in the string: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
            || str.charAt(i) == 'e'
            || str.charAt(i) == 'i'
            || str.charAt(i) == 'o'
            || str.charAt(i) == 'u') {
                System.out.println((i+1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        mainE();
    }
}




