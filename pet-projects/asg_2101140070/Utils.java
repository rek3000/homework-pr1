import java.util.*;

public class Utils {
  static Scanner utilScan = new Scanner(System.in);

  public static void addProduct(ArrayList<Products> list) {
    String name;
    double price;
    long quantity;

    System.out.println("How many items do you want to? ");
    System.out.print("> ");
    int n = utilScan.nextInt();
    // Add items
    for (int i = 0; i < n; i++) {
      utilScan.nextLine(); 

      System.out.print("Name: ");  
      name = utilScan.nextLine();
      System.out.print("Price: ");  
      price = utilScan.nextDouble();
      System.out.print("Quantity: ");  
      quantity = utilScan.nextLong();
      list.add(new Products(name, price, quantity));
      System.out.println();
    }

    System.out.println();
    System.out.println("DONE");
    System.out.println();
  }

  public static void displayProduct(ArrayList<Products> list) {
    for (int i = 0; i < list.size(); ++i) {
      System.out.print((i+1) + ". ");
      System.out.println(list.get(i).getInfo());
    }

    System.out.println();
    System.out.println("DONE");
    System.out.println();
  }

  public static void deleteProduct(ArrayList<Products> list) {
    System.out.print("Enter product ID: ");
    int index = utilScan.nextInt() - 1;

    list.remove(index);

    System.out.println();
    System.out.println("DONE");
    System.out.println();

  }

  public static void editProduct(ArrayList<Products> list) {
    String name;
    double price;
    long quantity;


    System.out.print("Enter product ID: ");
    int index = utilScan.nextInt() - 1;

    utilScan.nextLine(); 
    System.out.print("Name: ");  
    name = utilScan.nextLine();
    System.out.print("Price: ");  
    price = utilScan.nextDouble();
    System.out.print("Quantity: ");  
    quantity = utilScan.nextLong();
    list.set(index, new Products(name, price, quantity));

    System.out.println();
    System.out.println("DONE");
    System.out.println();
  }

  public static void searchProductByName(ArrayList<Products> list) {
    utilScan.nextLine();
    System.out.print("Search: ");
    String keyWord = utilScan.nextLine();

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).name.contains(keyWord)) {
        System.out.print((i+1) + ". ");
        System.out.println(list.get(i).getInfo());
      } 

    }

    System.out.println();
    System.out.println("DONE");
    System.out.println();
  }

  public static void sortProductByPrice(ArrayList<Products> list) {

  }

  public static void saveProductsToFile(ArrayList<Products> list) {

  }

  public static void loadProductsFromFile(ArrayList<Products> list) {

  }
}
