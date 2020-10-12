package main;

import java.util.Collection;
import java.util.Random;

import main.store.*;

public class DayRunner {
  private Collection<Store> stores;

  DayRunner(Collection<Store> stores) {
    this.stores = stores;
  }

  // this is all of the operations that occur on a single day.
  public void runDay() {
    Random rand = new Random();
    // for each store, run a day simulation.
    for (Store store : stores) {
      int casualCount = rand.nextInt(12) + 1;
      for (int i = 0; i < casualCount; i++) {
        if (!store.isClosed()) {
          // run casual purchases
          // make sure to log when something didn't happen.
        }
      }

      int businessCount = rand.nextInt(3) + 1;
      for (int i = 0; i < businessCount; i++) {
        if (!store.isClosed()) {
          // run business purchases
          // make sure to log when something didn't happen.
        }
      }

      int cateringCount = rand.nextInt(3) + 1;
      for (int i = 0; i < cateringCount; i++){
        // run catering purchases
        // make sure to log when something didn't happen.
      }

      // restock the roll iff the stock of roll type = 0.
      store.restock();
    }
  }
}
