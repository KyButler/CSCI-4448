package main.store.inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inventory {

  private double startingInventory;

  private List<Item> items = new ArrayList<Item>();
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

  public double getPrice(String itemName) {
    for (Item item : items) {
      if (item.getName() == itemName){
        return item.getPrice();
      }
    }

    return 0.0;
  }

  public double getQuantity(String itemName) {
    for (Item item : items) {
      if (item.getName() == itemName){
        return item.getQuantity();
      }
    }

    return 0.0;
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

  public List<String> satisfiable(List<String> order) {
    // to get a list of all the items you can satisfy from an order, 
    // you have to make a copy that way you can subtract from the list
    // and then create a new list to keep track of which items you've
    // done thusfar.

    List<String> satisfiableItems = new ArrayList<String>();
    // for each item in the order
    for (String orderItem : order) {
      // find the item in the itemsCopy array.
      for (Item item : items) {
        if (item.getName() == orderItem) {
          // if the item quantity is not 0
          if (item.getQuantity() > 0) {
            // consume 1 from the copy array and add to success list.
            satisfiableItems.add(item.getName());
            item.consumeStock(1);
          }
        }
      }
    }

    
    if (order.equals(satisfiableItems)) {
      // this means if the order can be fully completed as asked, then the order is done,
      // and the inventory is subtracted.
    }
    else {
      for (String satisfiableItem : satisfiableItems){
        for (Item item : items) {
          if (item.getName() == satisfiableItem){
            item.addStock(1);
          }
        }
      }
    }
    return satisfiableItems;
  }

  public boolean isEmpty() {
    for (Item item : items) {
      if (item.getQuantity() > 0) {
        return false;
      }
    } 
    return true;
  }

  public List<Item> getInventory() {
    return items;
  }
}
