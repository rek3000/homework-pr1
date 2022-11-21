import java.io.*;
public class Products implements Serializable{
  String name;
  double price;
  long quantity;

  public Products(String name, double price, long quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getInfo() {
    return ("Name: " + this.name + " " + 
    "Price: " + this.price + " " + 
    "Quantity: " + this.quantity);
  }

}
