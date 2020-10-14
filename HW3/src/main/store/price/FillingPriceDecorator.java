package main.store.price;

import java.util.Random;

// HERE IS THE DECORATOR PATTERN
// This class can apply fillings to the rolls we have to offer
// Each filling costs $0.75 and this is added to the price of the order

public class FillingPriceDecorator extends PriceDecorator {
  public FillingPriceDecorator(Price price){
    super (price);
  }

  @Override
  public double getPrice(double rollPrice) {
    Random rand = new Random();
    // fillings cost 75 cents
    return price.getPrice(rollPrice) + (.75 * rand.nextInt(2));
  }
}
