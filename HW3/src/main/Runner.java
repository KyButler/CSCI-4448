package main;

import java.util.ArrayList;
import java.util.Collection;

import main.store.Store;

public class Runner {
  // list of all of the stores, which allows for as many as you'd want.
  private Collection<Store> Stores = new ArrayList<Store>();

  protected void go() {
    // TODO: do 30 items and more adding a new store with id 0 and inventory 30.
    Stores.add(new Store(0, 5));

    // adding a helper that runs the day at the store.
    DayRunner day = new DayRunner();

    // run a day
    // TODO: Change this to 30 days.
    // TODO: Add summary at the end.
    day.runDay(Stores);
  }
}
