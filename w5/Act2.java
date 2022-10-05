import java.util.*;

public class Act2 {
  public static void main(String[] args) {
    String str = input(); 
    printUpper(str);
    System.out.println();
    secondLetter(str);
    System.out.println();
    vowels(str);
  } 
  public static String input() {
    Scanner sc = new Scanner(System.in); 
    String str = sc.nextLine();
    sc.close(); 
    return str;
  }
  public static void printUpper(String str) { 
    System.out.println("The uppercase letters: ");
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        System.out.print(str.charAt(i) + " ");
      }
    }
  }

  public static void secondLetter(String str) {
    System.out.println("Every second letter: ");
    for (int i = 1; i < str.length(); i+=2) {
      System.out.print(str.charAt(i)); 
    } 
  }

  public static void vowels(String str) {
    String testStr = "aueoiAUEOI";
    String temp = str;
    int numberOfVowels = 0;
    for (int i = 0; i < str.length(); i++) {
      if (testStr.indexOf(str.charAt(i)) >= 0) {
        str = str.replace(str.charAt(i),'_'); 
        numberOfVowels++;
      }
    }
    System.out.println("String after replaced: ");
    System.out.println(str);
    System.out.println("The number of vowels is " + numberOfVowels);

    System.out.print("The positions of all vowels are ");
    for (int i = 0; i < temp.length(); i++) {
      if (testStr.indexOf(temp.charAt(i)) >= 0) {
        System.out.print(i + " ");
      }
    }
  }
}
