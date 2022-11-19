import java.util.HashMap;
import java.util.Scanner;

public class EngVieDictionary {
  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<>();
    dictionary.put("Ngot", "C6H12O6");
    dictionary.put("Chillies", "Thua ngot");

    Scanner input = new Scanner(System.in);

    while (true) {
      String word = input.nextLine();

      if (dictionary.containsKey(word)) {
        System.out.println(dictionary.get(word));
      } else {
        System.out.println("Not found");
      }

      System.out.println("Do you want to loop up another word?");
      System.out.println("[1]. Yes | [2].No");
      System.out.print("Answer: ");

      int choice = input.nextInt();
      input.nextLine();

      if (choice == 1) {
        continue;
      } else { 
        input.close();
        break;
      }
    }

  }  
}
