package main;

import java.util.ArrayList;
import java.util.Collection;

import main.store.Store;

public class Runner {
  protected void go(){
    // list of all of the stores.
    Collection<Store> Stores = new ArrayList<Store>();

    // TODO: find a way to confirm that the id specified isn't already being used.
    // right now it's manual, and can stay that way if not enough time, but could
    // create a 'store creation' handler thing. 

    // adding a new store with id 0 and inventory 30.
    Stores.add(new Store(0,30));

    // adding a helper that runs the day at the store.
    DayRunner day = new DayRunner();

    // run a day
    // TODO: this will be 30 days, don forget . . .
    day.runDay(Stores);
  }
}
