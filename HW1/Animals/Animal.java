package Animals;

// <!-- Example of Abstract Class! -->
public abstract class Animal {
  // each animal has a name

  // <!-- Example of encapsulation, since this variable can only be accessed and set by a constructor or 
  // class function, hiding it from other classes! -->
  private String name;

  // no default constructor for Animal written, as each subclass defines it's own
  // name to use in place.
  public Animal() {
  };

  // this is the constructor for an Animal with a string as a name
  public Animal(String name) {
    this.name = name;
  }

  // getter for private name string.
  public String getName() {
    return this.name;
  }

  // Every animal can wake up.
  public void wake() {
    System.out.println(this.name + " just woke up!");
  }

  public void makeNoise() { // for the rollcall
    System.out.println("RAWR!");
  }

  public void eat() {
    System.out.println(this.name + " takes their food and eats it fast!");
  }

  public void exercise() { // exercise
    System.out.println(this.name + " runs in circles!");
  }

  public void sleep() { // sleep
    System.out.println(this.name + " is going to bed.");
  }
}
