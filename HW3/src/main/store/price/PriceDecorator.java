package main.store.price;

// DECORATOR CLASS
// This class implements the decorator pattern
// Prices are applied and added to the total cost

public abstract class PriceDecorator implements PriceInterface {
  protected PriceInterface price;

  public PriceDecorator(Price price){
    this.price = price;
  }

  public double getPrice(double price) {
    return this.price.getPrice(price);
  }
}
