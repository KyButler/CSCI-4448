package main.store.inventory;

// This represents one item on the menu, in our case a Roll, however
// can easily be expanded to include drinks or napkins or what have you.

public class Item {
  private String name;
  private double quantity; // can you even have half of a roll? Ah well, double it is just in case.
  private double price; // $ Cents are supported

  public Item(String name, double quantity, double initialPrice){
    this.name = name;
    this.quantity = quantity;
    this.price = initialPrice;
  }

  public String getName() {
    return name;
  }

  public double getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return price;
  }

  // who knows, maybe the price of the item changes at a certain time of day
  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  public void addStock(double incomingStock) {
    this.quantity += incomingStock;
  }

  public void consumeStock(double outgoingStock) {
    this.quantity -= outgoingStock;
  }
}
