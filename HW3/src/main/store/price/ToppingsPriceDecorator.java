package main.store.price;

import java.util.Random;

// DECORATOR CLASS
// This class can apply toppings to the rolls we have to offer
// Each topping costs $0.25 and this is added to the price of the order

public class ToppingsPriceDecorator extends PriceDecorator {
  public ToppingsPriceDecorator(Price price){
    super (price);
  }

  @Override
  public double getPrice(double rollPrice) {
    Random rand = new Random();
    // toppings costs 25 cents
    return price.getPrice(rollPrice) + (.25 * rand.nextInt(3));
  }
}
