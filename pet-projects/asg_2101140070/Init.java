/* SOURCE: */
import java.util.*;

public class Init {
  static Scanner initScan = new Scanner(System.in);
  public static void main(String[] args) {

    ArrayList<Products> list = new ArrayList<>();
    menuLoop(list);

  }

  private static void menuLoop(ArrayList<Products> list) {
    while (true) {
      System.out.println("------------------------------------------");
      System.out.println("| [1]. Add products                      |");
      System.out.println("| [2]. Display products                  |");
      System.out.println("| [3]. Delete a product                  |");
      System.out.println("| [4]. Edit a product                    |");
      System.out.println("| [5]. Search for products by name       |");
      System.out.println("| [6]. Sort products by price            |");
      System.out.println("| [7]. Save products to binary file      |");
      System.out.println("| [8]. Load products from the saved file |");
      System.out.println("| [9]. Exit                              |");
      System.out.println("------------------------------------------");
      System.out.print("> ");

      initScan.nextLine();
      char choice = initScan.next().charAt(0);

      if ((choice < '1') || (choice > '9')) {
        continue;
      } else if (choice == '9') { 
        break;
      }

      switch (choice) {
        case '1':
          Utils.addProduct(list);
          break;

        case '2':
          Utils.displayProduct(list);
          break;

        case '3':
          Utils.deleteProduct(list);
          break;

        case '4':
          Utils.editProduct(list);
          break;

        case '5':
          Utils.searchProductByName(list);
          break;

        case '6':
          break;

        case '7':
          break;

        case '8':
          break;

        case '9':
          break;
        default:
          break;
      }

    }
  }
}
