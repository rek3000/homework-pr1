/* SOURCE: */
import java.util.*;

public class Init {
  public static void main(String[] args) {

    System.out.println("[1]. Add products");
    System.out.println("[2]. Display products");
    System.out.println("[3]. Delete a product");
    System.out.println("[4]. Edit a product");
    System.out.println("[5]. Search for products by name");
    System.out.println("[6]. Sort products by price");
    System.out.println("[7]. Save products to binary file");
    System.out.println("[8]. Load products from the saved file");
    System.out.println("[9]. Exit");

    ArrayList<Products> list = new ArrayList<>();

    Utils.addProduct(list);
    Utils.displayProduct(list);
  }

  private static void menuLoop(ArrayList<Products> list) {
    
  }
}
