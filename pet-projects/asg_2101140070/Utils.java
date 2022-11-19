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
      name = utilScan.nextLine();
      price = utilScan.nextDouble();
      quantity = utilScan.nextLong();
      list.add(new Products(name, price, quantity));
    }

  }

  public static void displayProduct(ArrayList<Products> list) {
    for (int i = 0; i < list.size(); ++i) {
      System.out.println(list.get(i).toString());
    }
  }

  public static void deleteProduct(ArrayList<Products> list) {

  }

  public static void editProduct(ArrayList<Products> list) {

  }

  public static void searchProductByName(ArrayList<Products> list) {

  }

  public static void sortProductByPrice(ArrayList<Products> list) {

  }

  public static void saveProductsToFile(ArrayList<Products> list) {

  }

  public static void loadProductsFromFile(ArrayList<Products> list) {

  }
}
