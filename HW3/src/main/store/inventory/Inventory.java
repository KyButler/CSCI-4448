package main.store.inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {

  private double startingInventory;

  private Collection<Item> items = new ArrayList<Item>();
  private Collection<Collection<Item>> inventoryLog = new ArrayList<Collection<Item>>();

  public Inventory(double startingInventory, String[] items, Double[] prices) {
    // when the inventory is first initialized, add startingInventory amount of each
    // type of roll to their respective Collections.

    for (int i = 0; i < items.length; i++){
      // every roll is 1 dollar
      this.items.add(new Item(items[i], startingInventory, prices[i]));
    }
    this.startingInventory = startingInventory;

    // log initial inventory as well!
    inventoryLog.add(this.items);
  }

  public void printInventoryCount() {
    for (Item item : items) {
      String name = item.getName();
      double quantity = item.getQuantity();
      System.out.println(name + "s - " + quantity);
    }
  }

  // called at the end of every day
  public void restock() {
    //great time to add the daily inventory to the inventory list tracking.
    inventoryLog.add(items);

    // if an item's quantity = 0, then restock it to the base amount.
    for (Item item : items) {
      if (item.getQuantity() == 0) {
        item.addStock(this.startingInventory);
      }
    }
  }

  public List<String> getOptions() {
    List<String> options = new ArrayList<String>();

    for (Item item : items) {
      options.add(item.getName());
    }

    return options;
  }
}
