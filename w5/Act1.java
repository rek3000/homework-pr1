package w5;

import java.util.*;
public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        String s = Integer.toBinaryString(num);
         if (s.length() < 8) {
             if (s.length() % 8 != 0) {
                 int x = s.length() % 8;
                 for (int i = 0; i < 8 - x; i++) {
                     s = 0 + s;
                 }
             }
         }
        System.out.println(s);
    }
}
