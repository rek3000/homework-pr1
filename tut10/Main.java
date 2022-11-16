/**
 * Main
 */
import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice;

    // Initialize an ArrayList
    ArrayList<String> list = new ArrayList<String>();

    while (true) {
      // Print options
      System.out.println("[1] Add item");
      System.out.println("[2] Item List");
      System.out.println("[3] Edit an item");
      System.out.println("[4] Remove an item");
      System.out.println("[5] Quit");
      System.out.print("Chose an option: ");
      choice = input.nextInt();

      // handling choice
      switch (choice) {
        case 1:
        System.out.println();
        System.out.print("How many do you want? ");
        int number = input.nextInt();
        addItem(list, number);
        break;
        case 2:
        System.out.println();
        itemList(list);
        System.out.println();
        break;
        case 3:
        System.out.println();
        System.out.println("Edit mode"); 
        System.out.println();
        break;
        case 4:
        System.out.println();
        System.out.println("Choose an item to remove");
        System.out.println();
        break;
        case 5:
        System.out.println();
        System.out.println("Goodbye!"); 
        input.close();
        return;

        default:
        break;
      }
    }
  }



  public static void addItem(ArrayList<String> list, int number) {
    Scanner input = new Scanner(System.in);
    String str;
    for (int i = 0; i < number; i++) {
      str = input.nextLine();
      list.add(str);
    }

    File f = new File("data.bin");
    try {
      FileOutputStream fos = new FileOutputStream (f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(list);
      oos.close();

    } catch (Exception e) {
    }



  }

  public static void itemList(ArrayList<String> list) {
    ArrayList<String> tempList = new ArrayList<String>();
    File f = new File("data.bin");

    try {
      FileInputStream fis = new FileInputStream (f);
      ObjectInputStream ois = new ObjectInputStream(fis);
      tempList = (ArrayList<String>) ois.readObject();
      ois.close();

    } catch (Exception e) {

    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i)); 
    }  

  }

  public static void editItem(ArrayList<String> list, int index) {

  }

  public static void removeItem() {

  }
}
