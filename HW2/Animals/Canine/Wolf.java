package Animals.Canine;

import Animals.NoiseStrategy;

public class Wolf extends Canine {
  public Wolf() {
    super("Wolf the Wolf");
  }

  public Wolf(String name) {
    super(name + " the Wolf", new HowlNoiseStrategy());
  }

  public Wolf(String name, NoiseStrategy noiseStrategy) {
    super(name + " the Wolf", noiseStrategy);
  }
}
