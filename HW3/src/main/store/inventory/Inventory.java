package main.store.inventory;

import java.util.ArrayList;
import java.util.Collection;

public class Inventory {

  private double startingInventory;

  private Collection<InventoryItem> inventory = new ArrayList<InventoryItem>();

  public Inventory(double startingInventory, String[] items) {
    // when the inventory is first initialized, add startingInventory amount of each
    // type of roll to their respective Collections.

    for (String item : items){
      inventory.add(new InventoryItem(item, startingInventory));
    }

    this.startingInventory = startingInventory;
  }

  public void printInventoryCount() {
    for (InventoryItem item : inventory) {
      String name = item.getName();
      double quantity = item.getQuantity();
      System.out.println(name + "s - " + quantity);
    }
  }

  public void restock() {
    for (InventoryItem item : inventory) {
      if (item.getQuantity() == 0) {
        item.addStock(this.startingInventory);
      }
    }
  }
}
