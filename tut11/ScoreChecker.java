import java.util.HashMap;
import java.util.Scanner;

public class ScoreChecker {
  public static void main(String[] args) {
    HashMap<String, Double> dictionary = new HashMap<>();
    dictionary.put("Thuan", 10.0);
    dictionary.put("Thang", 9.0);

    Scanner input = new Scanner(System.in);
    String word = input.nextLine();

    if (dictionary.containsKey(word)) {
      System.out.println(dictionary.get(word));
    } else {
      System.out.println("Score not found");
    }
  } 
}
