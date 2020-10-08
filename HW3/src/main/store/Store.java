// Possible TODO: Add enforcement to only allow instantiation given that the stores ID is unique
// - one way to do this is have a collection of stores, and call a function that sees if any stores
// have said ID, but there's tons of different ways.

// TODO: StartingInventory might be replaced with a stock() function
// that way it can get restocked during the day, but doesn't need to

package main.store;

public class Store {
  // Each store has an ID tied to it. They 'should' be unique per Store, but don't
  // have to be based on this implementation
  private int id;

  // Each store has an inventory.
  private Inventory inventory;

  // Store must be instantiated with an ID and a startingInventory. It's public, as to allow
  // other packages access to it.

  public Store(int id, int startingInventory) {
    this.id = id;
    this.inventory = new Inventory(startingInventory);
  }

  public void printInventoryCount() {
    System.out.println("Store " + id + " has: ");
    inventory.printInventoryCount();
  }

}
