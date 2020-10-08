package main.store;

import java.util.ArrayList;
import java.util.Collection;

import main.rolls.*;

public class Inventory {

  // A new Collection ArrayList for each type of Roll, keeping track
  // of how many we have in stock based on the lengths of the arrays.
  private Collection<Roll> SpringRolls = new ArrayList<Roll>();
  private Collection<Roll> EggRolls = new ArrayList<Roll>();
  private Collection<Roll> PastryRolls = new ArrayList<Roll>();
  private Collection<Roll> SausageRolls = new ArrayList<Roll>();
  private Collection<Roll> JellyRolls = new ArrayList<Roll>();

  Inventory(int startingInventory) {
    for (int i = 0; i < startingInventory; i++) { 
      SpringRolls.add(new Roll("Spring"));
      EggRolls.add(new Roll("Egg"));
      PastryRolls.add(new Roll("Pastry"));
      SausageRolls.add(new Roll("Sausage"));
      JellyRolls.add(new Roll("Jelly"));
    }
  }

  public void printInventoryCount() {
    System.out.println("Springrolls - " + SpringRolls.size());
    System.out.println("EggRolls - " + SpringRolls.size());
    System.out.println("PastryRolls - " + SpringRolls.size());
    System.out.println("SausageRolls - " + SpringRolls.size());
    System.out.println("JellyRolls - " + SpringRolls.size());
  }

}
