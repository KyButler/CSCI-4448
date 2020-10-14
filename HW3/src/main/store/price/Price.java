package main.store.price;

public class Price implements PriceInterface {
  
  @Override
  public double getPrice(double rollPrice){
    return rollPrice;
  }
}
