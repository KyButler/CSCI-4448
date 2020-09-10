package Animals.Pachyderm;

import Animals.Animal;

public class Pachyderm extends Animal {
  public Pachyderm (String name) {
    super(name);
  }

  public void makeNoise() {
    System.out.println("<trumpet noise ensues>");
  }

  public void eat() {
    System.out.println(this.getName() + " ate their grass!");
  }
}
