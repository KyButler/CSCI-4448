package main.store.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.store.Store;

public class Casual implements Customer {
  private Random rand = new Random();

  @Override
  public void order(Store store) {
    int rollCount = rand.nextInt(3);
    boolean finishedOrder = false;
    List<String> totallyOutOf = new ArrayList<String>();

    while (!finishedOrder) {
      List<String> options = store.getOptions();
      String roll = options.get(rand.nextInt(options.size()));
      if (totallyOutOf.size() == options.size()){
        System.out.println("realistically, this shouldn't happen.");
      }

      while (totallyOutOf.contains(roll)){
        roll = options.get(rand.nextInt(options.size()));
      }

      List<String> newOrder = new ArrayList<String>();
      for (int i = 0; i < rollCount; i++){
        newOrder.add(roll);
      }

      store.canSatisfyOrder(newOrder);
    }
    

  }
}
