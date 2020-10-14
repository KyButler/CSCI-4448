package main.store.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.store.Store;

public class Casual implements Customer {
  private Random rand = new Random();

  @Override
  public void order(Store store, int day) {
    int rollCount = rand.nextInt(3) + 1;
    boolean finishedOrder = false;
    List<String> totallyOutOf = new ArrayList<String>();
    List<String> newOrder = new ArrayList<String>();
    List<String> options = store.getOptions();

    while (!finishedOrder) {
      newOrder.clear();
      String roll = options.get(rand.nextInt(options.size()));

      while (totallyOutOf.contains(roll)) {
        roll = options.get(rand.nextInt(options.size()));
      }

      for (int i = 0; i < rollCount; i++) {
        newOrder.add(roll);
      }

      List<String> satisfiable = store.satisfiable(newOrder, day, "Casual");

      // TODO: handle returning of the string
      if (satisfiable.equals(newOrder)) {
        finishedOrder = true;
      } else {
        // TODO: handle an unsatisfied order
        // if the order can't be completed because the store has 0 of the requested
        // donut, then you want to add the roll to the list of rolls and re-try.
        if (satisfiable.size() == 0) {
          // observer.eventAnnouncement("ran out of " + roll);
          totallyOutOf.add(roll);
        }
        // else it's because they didn't have enough of the wanted roll. Therefore,
        // you need to ask for how many they had.
        else {
          newOrder.clear();
          for (int i = 0; i < satisfiable.size(); i++) {
            newOrder.add(roll);
          }
          satisfiable = store.satisfiable(newOrder, day, "Casual");
          // this should, always, work, however if it doesn't here's my print
          if (satisfiable.equals(newOrder)) {
            finishedOrder = true;
          }
        }
      }
    }
  }
}
