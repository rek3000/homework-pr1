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
    return ("| " + this.id + " ".repeat((8 - this.id.length())) + 
            "| " + this.name + " ".repeat((13 - this.name.length())) + 
            "| " + this.price + " ".repeat((10 - String.valueOf(this.price).length())) + 
            "| " + this.quantity + " ".repeat((12 - String.valueOf(this.quantity).length())) + "|");
  }

}
