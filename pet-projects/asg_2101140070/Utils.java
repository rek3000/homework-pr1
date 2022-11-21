import java.util.*;
import java.io.*;

public class Utils {
  static Scanner utilScan = new Scanner(System.in);

  public static void addProduct(ArrayList<Products> list) {
    String name;
    double price;
    long quantity;
    int n;

    // Error handling
    while (true) {
      try {
        System.out.println("How many items do you want to? ");
        System.out.print("> ");
        n = utilScan.nextInt();
        if (n < 1) {
          continue;
        }
        break; 
      } catch (Exception e) {
        System.out.println("It isn't a number!");
        utilScan.nextLine();
        continue;
      }
    }

    utilScan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    // Add items
    for (int i = 0; i < n; i++) {
      System.out.println();
      System.out.print("Name: ");  
      name = utilScan.nextLine();
      System.out.print("Price: ");  
      price = utilScan.nextDouble();
      System.out.print("Quantity: ");  
      quantity = utilScan.nextLong();

      list.add(new Products(name, price, quantity));
      utilScan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    }

    System.out.println();
    System.out.println("****");
    System.out.println("DONE");
    System.out.println("****");
    System.out.println();
  }

  public static void displayProduct(ArrayList<Products> list) {
    for (int i = 0; i < list.size(); ++i) {
      System.out.print((i+1) + ". ");
      System.out.println(list.get(i).getInfo());
    }

    System.out.println();
  }

  public static void deleteProduct(ArrayList<Products> list) {
    int index;
    while (true) {
      try {
        System.out.print("Enter product ID: ");
        index = utilScan.nextInt() - 1;
        if (index < 1 || index > list.size()) {
          continue;
        }
        break;
      } catch (Exception e) {
        System.out.println("ID isn't valid!");
        utilScan.nextLine();
        continue;
      }
    }
    utilScan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    list.remove(index);

    System.out.println();
    System.out.println("****");
    System.out.println("DONE");
    System.out.println("****");
    System.out.println();

  }

  public static void editProduct(ArrayList<Products> list) {
    String name;
    double price;
    long quantity;
    int index;

    while (true) {
      try {
        System.out.print("Enter product ID: ");
        index = utilScan.nextInt() - 1;
        if (index < 1 || index > list.size()) {
          continue;
        }
        break;
      } catch (Exception e) {
        System.out.println("ID isn't valid!");
        utilScan.nextLine();
        continue;
      }
    }

    utilScan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    System.out.print("Name: ");  
    name = utilScan.nextLine();
    System.out.print("Price: ");  
    price = utilScan.nextDouble();
    System.out.print("Quantity: ");  
    quantity = utilScan.nextLong();
    utilScan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    list.set(index, new Products(name, price, quantity));

    System.out.println();
    System.out.println("****");
    System.out.println("DONE");
    System.out.println("****");
    System.out.println();
  }

  public static void searchProductByName(ArrayList<Products> list) {
    System.out.print("Search: ");
    String keyWord = utilScan.nextLine();

    // Case-Insensitive Search
    if (!(keyWord == "")) {
      for (int i = 0; i < list.size(); i++) {
        if (list.get(i).name.toLowerCase().contains(keyWord.toLowerCase())) {
          System.out.print((i+1) + ". ");
          System.out.println(list.get(i).getInfo());
        } 
      }
    }

    System.out.println();
  }

  public static void sortProductByPrice(ArrayList<Products> list) {
    // TreeMap<Double, Integer> tree = new TreeMap<Double, Integer>();
    //
    // for (int i = 0; i < list.size(); i++) {
    //   tree.put(list.get(i).price, i);
    // }
    // // System.out.println(tree);
    //
    // // get id according to price from TreeMap
    // int indexOfMinValue;
    // for (int i = 0; i < list.size(); i++) {
    //   indexOfMinValue = tree.get(tree.firstKey());
    //   System.out.println(list.get(indexOfMinValue).getInfo());
    //   tree.remove(tree.firstKey());
    // }
    // ArrayList<Double, String> tmp = new ArrayList<Double, String>();
    // for (int i = 0; i < list.size(); i++) {
    //   tmp.add(list.get(i).price, list.get(i).name);
    // }

    System.out.println();
  }

  public static void saveProductsToFile(ArrayList<Products> list) {
    System.out.print("Enter file name: ");
    File f = new File(utilScan.nextLine());
    try {
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(list);
      oos.flush();
      oos.close();

    } catch (Exception e) {
    }
  }

  public static void loadProductsFromFile(ArrayList<Products> list) {
    System.out.print("Enter file name: ");
    File f = new File(utilScan.nextLine());
    try {
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);
      ArrayList<Products> tmp = (ArrayList<Products>) ois.readObject();
      ois.close();
      list.clear();

      for (int i = 0; i < tmp.size(); i++) {
        list.add(new Products(tmp.get(i).name, tmp.get(i).price, tmp.get(i).quantity));
      }
    } catch (Exception e) {
    }
  }
}
