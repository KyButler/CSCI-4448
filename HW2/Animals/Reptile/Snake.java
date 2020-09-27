package Animals.Reptile;

import Animals.NoiseStrategy;

public class Snake extends Reptile {
  public Snake() {
    super("Snake the Snake");
  }

  public Snake(final String name) {
    super(name + " the Snake");
  }

  public Snake(String name, NoiseStrategy noiseStrategy) {
    super(name + " the Snake", noiseStrategy);
  }
  
  public void eat() {
    System.out.println(this.getName() + " eats a mouse . . ew!");
  }

  public void exercise() {
    System.out.println(this.getName() + " . . . do snakes even exercise?");
  }
}
