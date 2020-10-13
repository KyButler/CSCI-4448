package main.store.inventory;

import java.util.ArrayList;
import java.util.Collection;

public class Inventory {

  private double startingInventory;

  private Collection<InventoryItem> inventory = new ArrayList<InventoryItem>();
  private Collection<Collection<InventoryItem>> inventoryLog = new ArrayList<Collection<InventoryItem>>();

  public Inventory(double startingInventory, String[] items, Double[] prices) {
    // when the inventory is first initialized, add startingInventory amount of each
    // type of roll to their respective Collections.

    for (int i = 0; i < items.length; i++){
      // every roll is 1 dollar
      inventory.add(new InventoryItem(items[i], startingInventory, prices[i]));
    }
    this.startingInventory = startingInventory;

    // log initial inventory as well!
    inventoryLog.add(inventory);
  }

  public void printInventoryCount() {
    for (InventoryItem item : inventory) {
      String name = item.getName();
      double quantity = item.getQuantity();
      System.out.println(name + "s - " + quantity);
    }
  }

  // called at the end of every day
  public void restock() {
    //great time to add the daily inventory to the inventory list tracking.
    inventoryLog.add(inventory);

    // if an item's quantity = 0, then restock it to the base amount.
    for (InventoryItem item : inventory) {
      if (item.getQuantity() == 0) {
        item.addStock(this.startingInventory);
      }
    }
  }
}
