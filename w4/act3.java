package w4;

import java.util.Scanner;
public class Act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the amount of money: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the numbers of years: ");
        int years = scanner.nextInt();
        scanner.close();

        double rate = 6.8;
        for (int i = 0; i < years; i++) {
            amount += amount * (rate / 100);
        }
        System.out.println("The amount of money after " + years + " years is " + amount);
    }
    
}
