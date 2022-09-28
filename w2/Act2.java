package w2;
import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base length: ");  
		double b = sc.nextDouble(); 
        System.out.println("Enter height: ");  
		double h = sc.nextDouble();
        sc.close();
        
        double A = (h*b)/2;
        
        System.out.println("Base length: " + b + " (cm)");
        System.out.println("Height: " + h + " (cm)");
        System.out.println("The triangle's area: " + A + " (cm2)");
    }
}
