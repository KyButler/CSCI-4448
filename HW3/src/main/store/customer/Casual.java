package main.store.customer;

import java.util.Random;

import main.store.Store;

public class Casual implements Customer {
  private Random rand = new Random();

  @Override
  public void order(Store store) {
    int rollCount = rand.nextInt(3);
    

  }
}
