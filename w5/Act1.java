import java.util.Scanner;

public class Act1 {
  public static void main(String[] agrs) {
    int number = getInput(); 
    String binForm = Integer.toBinaryString(number);
    System.out.println(binForm);
  }

  static int getInput() {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    return input; 
  }
}

