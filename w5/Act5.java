package w5;

import java.util.*;
public class Act5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter a integer between 10 and 20: ");
            n = sc.nextInt();  
            
            if (n < 10 || n > 20) {
            System.out.println("But you must enter an integer between 10 and 20: " + n);
            continue;
            } else {
            System.out.println("Thank you, " + n + " it is!");
            break;
            }
        }
        sc.close();
    }
}