// Possible TODO: Add enforcement to only allow instantiation given that the stores ID is unique
// - one way to do this is have a collection of stores, and call a function that sees if any stores
// have said ID, but there's tons of different ways.

// TODO: StartingInventory might be replaced with a stock() function
// that way it can get restocked during the day, but doesn't need to

package main.store;

import java.util.List;

import main.store.inventory.*;

public class Store {
  // Each store has an ID tied to it. They 'should' be unique per Store, but don't
  // have to be based on this implementation
  private int id;

  // Each store has an inventory.
  private Inventory inventory;

  // false while open, true while closed. This is to handle running out of inventory.
  private boolean isOpen;

  // this isn't editable at run time, but I don't think it needs to be.
  private String[] menu = {"Spring Roll", "Egg Roll", "Pastry Roll", "Sausage Roll", "Jelly Roll"};
  private Double[] prices = {.50, .75, 1.0, 1.25, 1.5};

  // Store must be instantiated with an ID and a startingInventory. It's public, as to allow
  // other packages access to it.

  public Store(int id, int startingInventory) {
    this.id = id;
    this.inventory = new Inventory(startingInventory, menu, prices);
    this.isOpen = true;
  }

  // TODO: remove this it's only for debugging
  public void printInventoryCount() {
    System.out.println("Store " + id + " has: ");
    inventory.printInventoryCount();
  }

  public boolean isOpen() {
    return isOpen;
  }

  public void restock() {
    inventory.restock();
  }

  public List<String> getOptions() {
    return inventory.getOptions();
  }

  public boolean canSatisfyOrder(List<String> frick) {
    return false;

  }
}
