package main;

import java.util.Collection;

import main.store.*;

public class DayRunner {
  private Collection<Store> stores;

  DayRunner(Collection<Store> stores){
    this.stores = stores;
  }

  // this is all of the operations that occur on a single day.
  public void runDay(){
    // for each store, run a day simulation.
    for (Store store : stores) {
      store.printInventoryCount();
      store.buy("Spring Roll");
    }
  }
}
