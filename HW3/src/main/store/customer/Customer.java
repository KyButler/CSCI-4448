package main.store.customer;

import main.store.Store;

public interface Customer {
  void order(Store store, int day);
}