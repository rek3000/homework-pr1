import java.util.*;
public class Act4 {
  public static void main(String[] args) {
    String card = input();
    System.out.println(card);
    card = card.replaceAll("\\s","");
    card = card.replaceAll("-","");

    System.out.println(card);
    int[] arrStr = new int[card.length()];
    arrStr = convert(card);
    System.out.println(Arrays.toString(arrStr));
    int result = caculateSum(arrStr);
    System.out.println(result); 
		
		//
    if (result % 10 == 0) {
      System.out.println("The card number is valid"); 
    } else {
      System.out.println("Invalid!"); 
    } 

		sc.close();
  }

  public static String input() {
    final Scanner sc = new Scanner(System.in); 
    String str = sc.nextLine();
    return str;
  }

  public static int[] convert(String str) {
    int[] arrStr = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i); 
      arrStr[i] = Character.getNumericValue(ch);
    }
    return arrStr;
  }

  public static int caculateSum(int[] arrStr) {
    int sum = 0;
    
    for (int i = 0; i < arrStr.length; i++) {
      sum += arrStr[i]; 
    }

    for (int i = arrStr.length - 2; i >= 0; i-=2) {
      sum += arrStr[i]; 
      if (i > 4) {
        sum++; 
      }
    }

    return sum;
  }
}
