package w4;

import java.util.*;
public class Act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        for (int i = str.length(); i > 0; --i) {
            System.out.print(str.charAt(i - 1));
        }
    }
}
