import java.util.Scanner;

public class Act1 {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int number = getInput(); 

    String binForm = Integer.toBinaryString(number);
    System.out.println(binForm);

		sc.close();
  }
}

