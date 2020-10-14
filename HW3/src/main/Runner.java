package main;

import java.util.ArrayList;
import java.util.Collection;

import main.store.Store;

public class Runner {
  // list of all of the stores, which allows for as many as you'd want.
  private Collection<Store> stores = new ArrayList<Store>();

  protected void go() {
    // TODO: do 30 items and more adding a new store with id 0 and inventory 30.
    stores.add(new Store(0, 30));
    // stores.add(new Store(0, 45));
    // stores.add(new Store(0, 60));

    // adding a helper that runs the day at the store.
    DayRunner day = new DayRunner();

    // run a day
    // TODO: Add summary at the end.
    for (int i = 1; i < 31; i++) {
      day.runDay(stores, i);
    }
    
    for (Store store : stores){
      store.printEndSummary();
    }
  }
}
