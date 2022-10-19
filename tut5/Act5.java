import java.util.*;
public class Act5 {
  public static void main(String[] args) {
    int x = input();
    System.out.println("Thank you, " + x + " it is.");
  }

  public static int input() {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    while (x <= 10 || x >= 20) {
      try {
        x = sc.nextInt();
      } catch (Exception e) {
        sc.nextLine();
        System.out.print("Must >= 10 and <= 20: ");
        continue;
      }
    } 
    sc.close();
    return x;
  } 
}
