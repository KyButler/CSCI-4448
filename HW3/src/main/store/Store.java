// Possible TODO: Add enforcement to only allow instantiation given that the stores ID is unique
// - one way to do this is have a collection of stores, and call a function that sees if any stores
// have said ID, but there's tons of different ways.

// TODO: StartingInventory might be replaced with a stock() function
// that way it can get restocked during the day, but doesn't need to

package main.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.store.inventory.*;
import main.store.price.*;
import main.store.transactions.*;

public class Store {
  // Each store has an ID tied to it. They 'should' be unique per Store, but don't
  // have to be based on this implementation
  private int id;

  // Each store has an inventory.
  private Inventory inventory;

  // false while open, true while closed. This is to handle running out of inventory.
  private boolean isOpen;

  protected StoreAnnouncer observer;

  private TransactionLog transactionLog = new TransactionLog();

  // this isn't editable at run time, but I don't think it needs to be.
  private String[] menu = {"Spring Roll", "Egg Roll", "Pastry Roll", "Sausage Roll", "Jelly Roll"};
  private Double[] prices = {.50, .75, 1.0, 1.25, 1.5};

  // Store must be instantiated with an ID and a startingInventory. It's public, as to allow
  // other packages access to it.

  public Store(int id, int startingInventory) {
    this.id = id;
    this.isOpen = true;
    this.observer = new StoreAnnouncer();
    this.inventory = new Inventory(startingInventory, menu, prices);
  }

  public boolean isOpen() {
    return isOpen;
  }

  public void restock() {
    inventory.restock();
    this.isOpen = true;
  }

  public List<String> getOptions() {
    return inventory.getOptions();
  }

  // create a list of up to 15 total random rolls to help
  // out the caterer
  public List<String> helpCaterer() {
    List <Item> items = this.inventory.getInventory();

    List <String> allItems = new ArrayList<String>();

    for (Item item : items) {
      for (int i = 0; i < item.getQuantity(); i++){
        allItems.add(item.getName());
      }
    }

    Collections.shuffle(allItems);

    List <String> craftedChoice = new ArrayList<String>();

    for (int i = 0; i < (allItems.size() < 15 ? allItems.size() : 15); i++){
      craftedChoice.add(allItems.get(i));
    }

    return craftedChoice;
  }

  // TODO: might need customer type for logging
  public List<String> satisfiable(List<String> order, int day, String customerType) {
    List<String> satisfiable = inventory.satisfiable(order);

    

    if (order.equals(satisfiable)) {
      List<List<String>> rolls = new ArrayList<List<String>>();

      // TODO: calculate cost of order
      double totalPrice = 0;
      for (String item : satisfiable) {
        List<String> roll = new ArrayList<String>();
        roll.add(item);
        // starting roll price
        double startingRollPrice = inventory.getPrice(item);
        // adding a filling
        PriceInterface rollPriceWithFilling = new FillingPriceDecorator(new Price());

        double newRollPrice = rollPriceWithFilling.getPrice(startingRollPrice);

        // filling costs .75

        double fillingCost = (newRollPrice - startingRollPrice);
        for (int i = 0; i < fillingCost / .75; i++ ){
          roll.add("Filling");
        }
        double oldRollPrice = newRollPrice;

        // adding a sauce
        PriceInterface rollPriceWithSauce = new SaucePriceDecorator(new Price());
        newRollPrice = rollPriceWithSauce.getPrice(oldRollPrice);

        // sauce cost .50

        double sauceCost = (newRollPrice - oldRollPrice);
        for (int i = 0; i < sauceCost / .50; i++ ){
          roll.add("Sauce");
        }
        oldRollPrice = newRollPrice;
        
        // adding a topping
        PriceInterface rollPriceWithTopping = new ToppingsPriceDecorator(new Price());
        newRollPrice = rollPriceWithTopping.getPrice(oldRollPrice);

        // topping cost .25
        double toppingCost = (newRollPrice - oldRollPrice);
        for (int i = 0; i < toppingCost / .25; i++ ){
          roll.add("Topping");
        }

        totalPrice += newRollPrice;
        rolls.add(roll);
      }


      Transaction newTransaction = new Transaction(day, rolls, customerType, totalPrice);
      transactionLog.addTransaction(newTransaction);

      List<String> alreadyAnnounced = new ArrayList<String>();
      for (String item : satisfiable) {
        if (inventory.getQuantity(item) == 0){
          int x = 0;
          for (String announced : alreadyAnnounced){
            if (announced == item){
              break;
            }
            else{
              x += 1;
            }
          }
          if (x == alreadyAnnounced.size()){
            observer.eventAnnouncment("ran out of " + item);
            alreadyAnnounced.add(item);
          }
        }
      }
    }
    else {
      // TODO: record why it wasn't satisiable
    }

    this.isOpen = !inventory.isEmpty();
    if (inventory.isEmpty()) {
      observer.eventAnnouncment("closed due to no stock");
    }

    return satisfiable;
  }

  public void printSummary(){
    transactionLog.printAllTransactions();
  }
}
