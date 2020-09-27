package Animals.Feline;

import Animals.NoiseStrategy;

public class Tiger extends Feline {
  public Tiger() {
    super("Tiger the Tiger");
  }

  public Tiger(String name) {
    super(name + " the Tiger");
  }

  public Tiger(String name, NoiseStrategy noiseStrategy) {
    super(name + " the Tiger", noiseStrategy);
  }

  public void exercise() {
    System.out.println(this.getName() + " runs around restlessly!");
  }
}
