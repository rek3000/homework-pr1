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
      while (true) {
        System.out.print("Price: ");  
        try {
          price = utilScan.nextDouble();
          break;
        } catch (Exception e) {
          System.out.println("INVALID");
          continue;
        }
      }

      while (true) {
        System.out.print("Quantity: ");  
        try {
          quantity = utilScan.nextLong();
          break;
        } catch (Exception e) {
          System.out.println("INVALID");
          continue;
        }
      }

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
    String id;
    boolean quit = false;
    while (!quit) {
      System.out.print("Enter product ID: ");
      id = utilScan.nextLine();
      for (int i = 0; i < list.size(); i++) {
        if (id.equals(list.get(i).id)) {
          quit = true;
          list.remove(i);
          break;
        } else if (i == list.size() - 1) {
          System.out.println("ID not found!");
        }
      }
    }

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
    String id;
    boolean quit = false;

    while (!quit) {
      System.out.print("Enter product ID: ");
      id = utilScan.nextLine();
      for (int i = 0; i < list.size(); i++) {
        if (id.equals(list.get(i).id)) {
          quit = true;
          System.out.print("Name: ");  
          name = utilScan.nextLine();
          while (true) {
            System.out.print("Price: ");  
            try {
              price = utilScan.nextDouble();
              break;
            } catch (Exception e) {
              System.out.println("INVALID");
              continue;
            }
          }

          while (true) {
            System.out.print("Quantity: ");  
            try {
              quantity = utilScan.nextLong();
              break;
            } catch (Exception e) {
              System.out.println("INVALID");
              continue;
            }
          }

          list.set(i, new Products(name, price, quantity));
          utilScan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          break;
        } else if (i == list.size() - 1) {
          System.out.println("ID not found!");
        }
      } 
    }

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
    ArrayList<String> mapKeys = new ArrayList<>();
    ArrayList<Double> mapValues = new ArrayList<>();
    
    Collections.sort(mapKeys);
    Collections.sort(mapValues);

    // ArrayList<Products> sorted = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      mapKeys.add(list.get(i).name);
      mapValues.add(list.get(i).price);
    }
    
    for (int i = 0; i < mapValues.size(); i++) {
      Double val = mapValues.get(i);

      for (int j = 0; j < mapKeys.size(); i++) {
        String key = mapKeys.get(j);

        if ((val == (Double) list.get(j).price) && (key.equals(list.get(j).name))) {
          System.out.println(list.get(j).getInfo());
          break;
        }
      }
    }
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
