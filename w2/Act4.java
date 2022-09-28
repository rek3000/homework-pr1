package w2;
import java.util.Scanner;;
public class Act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");  
		int a = sc.nextInt();  
        System.out.println("Enter second number: ");  
		int b = sc.nextInt();  
        System.out.println("Enter third number: ");  
		int c = sc.nextInt();  
        sc.close(); 

        if(c>b && c>a) {
            System.out.println("c is largest.");
        }
        if(b>a && b>c) {
            System.out.println("b is largest.");
        }
        if(a>c && a>b) {
            System.out.println("a is largest.");
        }
}
}