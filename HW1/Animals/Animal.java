package Animals;

public abstract class Animal {
  // each animal has a name
  private String name;

  // no default constructor for Animal exists, as each subclass defines it's own name to use in place.
  public Animal() {};

  // this is the constructor for an Animal with a string as a name
  public Animal(String name) {
    this.name = name;
  }

  // Every animal can wake up.
  public void wake() {
    System.out.println(this.name + " just woke up!");
  }
}
