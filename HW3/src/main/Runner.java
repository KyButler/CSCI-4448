package main;

import java.util.ArrayList;
import java.util.Collection;

import main.store.Store;
import test.MyUnitTest;

public class Runner {
  // list of all of the stores, which allows for as many as you'd want.
  private Collection<Store> stores = new ArrayList<Store>();

  protected void go() {
    MyUnitTest tester = new MyUnitTest();
    System.out.println("BEGIN JUNIT TESTS");
    tester.testIdAssignment();
    tester.itemConsume();
    tester.itemAdd();
    tester.transactionWorks();
    tester.customerFactoryBusiness();
    tester.customerFactoryCasual();
    tester.customerFactoryCatering();
    tester.priceFillingsDecorator();
    tester.priceToppingsDecorator();
    tester.priceSauceDecorator();
    System.out.println("END JUNIT TESTS \n");

    stores.add(new Store(0, 30));
    // stores.add(new Store(0, 45));
    // stores.add(new Store(0, 60));

    // adding a helper that runs the day at the store.
    DayRunner day = new DayRunner();

    // run a day
    for (int i = 1; i < 31; i++) {
      day.runDay(stores, i);
    }
    
    for (Store store : stores){
      store.printEndSummary();
    }


  }
}
