package main.store.inventory;

import java.util.ArrayList;
import java.util.Collection;

public class Inventory {

  private Collection<InventoryItem> inventory = new ArrayList<InventoryItem>();

  public Inventory(int startingInventory, String[] items) {
    // when the inventory is first initialized, add startingInventory amount of each
    // type of roll to their respective Collections.

    for (String item : items){
      inventory.add(new InventoryItem(item, startingInventory));
    }
  }

  public void printInventoryCount() {
    for (InventoryItem item : inventory) {
      String name = item.getName();
      double quantity = item.getQuantity();
      System.out.println(name + "s - " + quantity);
    }
  }

  // public int buy(String itemName ) {

  // }

}
