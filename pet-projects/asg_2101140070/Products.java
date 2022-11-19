public class Products {
  String name;
  double price;
  long quantity;

  public Products(String name, double price, long quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return ("Name: " + this.name + " " + 
    "Price: " + this.price + " " + 
    "Quantity: " + this.quantity);
  }

}
