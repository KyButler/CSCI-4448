package Animals.Feline;

import Animals.NoiseStrategy;

public class Cat extends Feline {
  public Cat() {
    super("Cat the Cat");
  }

  public Cat(String name) {
    super(name + " the Cat");
  }

  public Cat(String name, NoiseStrategy noiseStrategy) {
    super(name + " the Cat", noiseStrategy);
  }
}
