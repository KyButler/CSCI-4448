package Animals.Canine;

import Animals.Animal;

public abstract class Canine extends Animal {
  public Canine(String name) {
    super(name);
  }

  public void makeNoise() {
    System.out.println("Bark!");
  }

  public void eat() {
    System.out.println(this.getName() + " ate a rabbit!");
  }

  public void exercise() {
    System.out.println(this.getName() + " ran with his pals!");
  }
}
