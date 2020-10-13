package main;

import java.util.ArrayList;
import java.util.Collection;

import main.store.Store;

public class Runner {
  protected void go(){
    // list of all of the stores, which allows for as many as you'd want.
    Collection<Store> Stores = new ArrayList<Store>();

    // adding a new store with id 0 and inventory 30.
    Stores.add(new Store(0,30));

    // adding a helper that runs the day at the store.
    DayRunner day = new DayRunner();

    // run a day
    // TODO: Change this to 30 days.
    // TODO: Add summary at the end.
    day.runDay(Stores);
  }
}
