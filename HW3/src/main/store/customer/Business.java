package main.store.customer;

import main.store.Store;

import java.util.ArrayList;
import java.util.List;

public class Business implements Customer {
  @Override
  public void order(Store store) {
    List<String> newOrder = new ArrayList<String>();

    List<String> options = store.getOptions();

    for (String option : options) {
      newOrder.add(option);
      newOrder.add(option);
    }
    if (store.satisfiable(newOrder).equals(newOrder)){
      System.out.println("Business customer successful purchase!" + newOrder);
    }
    else{
      System.out.println("Business customer failed purchase!" + newOrder);
    };

  }
}
