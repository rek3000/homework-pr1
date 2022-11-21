import java.io.*;
import java.util.*;
public class Products implements Serializable{
  String name;
  double price;
  long quantity;
  String id;

  public Products(String name, double price, long quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.id = this.name.length() + this.name.substring(0,2).toLowerCase() + quantity;
  }

  public String getInfo() {
    return ("ID: " + this.id + " " +
    "Name: " + this.name + " " + 
    "Price: " + this.price + " " + 
    "Quantity: " + this.quantity);
  }

}
