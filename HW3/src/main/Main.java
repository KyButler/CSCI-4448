package main;

import main.store.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");


    // TODO: Implement a day function. Can be here, can be somewhere else.
    Store Katamari = new Store(0, 30);
    Katamari.printInventoryCount();
  }
}
