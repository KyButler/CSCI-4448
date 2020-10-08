package main.rolls;

// Class for defining a Roll!

// Since there is no distinction between types of Rolls other than literall
// their name, there is no need to subclass them. We can just identify
// the different types by using a String identifier.

public class Roll {

  // The type of roll, ranging from Spring to Jelly to whatever!
  private String type;

  // Instantiator, must be public as rolls is not in the same package as the store / inventory.
  public Roll(String type) {
    this.type = type + " Roll";
  }

  public String getType() {
    return this.type;
  }


}
