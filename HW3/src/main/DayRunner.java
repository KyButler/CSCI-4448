package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import main.store.*;
import main.store.customer.*;

public class DayRunner {
  // this is all of the operations that occur on a single day.
  public void runDay(Collection<Store> stores) {
    Random rand = new Random();
    CustomerFactory customerFactory = new CustomerFactory();

    // for each store, run a day simulation.
    for (Store store : stores) {
      // find out who 'should' be visiting on a given day.
      
      int casualCount = rand.nextInt(12) + 1;
      int businessCount = rand.nextInt(3) + 1;
      int cateringCount = rand.nextInt(3) + 1;

      Collection<Customer> customers = new ArrayList<Customer>();

      for (int i = 0; i < casualCount; i++) {
        customers.add(customerFactory.getCustomer("Casual"));
      }
      for (int i = 0; i < businessCount; i++) {
        customers.add(customerFactory.getCustomer("Business"));
      }
      for (int i = 0; i < cateringCount; i++) {
        customers.add(customerFactory.getCustomer("Catering"));
      }

      for (Customer customer : customers) {
        customer.buy();
      }

      // restock the roll iff the stock of roll type = 0.
      // this also logs the daily transactions
      store.restock();
    }
  }
}
