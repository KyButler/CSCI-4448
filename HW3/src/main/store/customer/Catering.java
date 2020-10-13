package main.store.customer;

import main.store.Store;

public class Catering implements Customer {
  @Override
  public void order(Store store) {
    store.getOptions();
    // pick 3 options

  }
}
