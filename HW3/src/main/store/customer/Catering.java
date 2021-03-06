package main.store.customer;

import main.store.Store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catering implements Customer {
  @Override
  public void order(Store store, int day) {
    List<String> options = store.getOptions();
    List<String> newOrder = new ArrayList<String>();
    // pick 3 options, 5 of each type.

    Collections.shuffle(options);

    List<String> chosen = new ArrayList<String>();
    for (int i = 0; i < 3; i++) {
      chosen.add(options.get(i));
    }

    for (String rollType : chosen) {
      for (int i = 0; i < 5; i++) {
        newOrder.add(rollType);
      }
    }

    List<String> satisfiable = store.satisfiable(newOrder, day, "Catering");

    // if it wasn't successful
    if (!satisfiable.equals(newOrder)) {
      store.satisfiable(store.helpCaterer(), day, "Catering");
    } 
  }
}
