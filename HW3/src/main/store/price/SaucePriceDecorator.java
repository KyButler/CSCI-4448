package main.store.price;

import java.util.Random;

// DECORATOR CLASS
// This class can apply sauces to the rolls we have to offer
// Each sauce costs $0.50 and this is added to the price of the order

public class SaucePriceDecorator extends PriceDecorator {
  public SaucePriceDecorator(Price price){
    super (price);
  }

  @Override
  public double getPrice(double rollPrice) {
    Random rand = new Random();
    // sauce costs 50 cents
    return price.getPrice(rollPrice) + (.50 * rand.nextInt(4));
  }
}
