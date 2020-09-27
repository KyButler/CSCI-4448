package Animals.Reptile;

import Animals.Animal;
import Animals.NoiseStrategy;

public abstract class Reptile extends Animal {
  public Reptile(String name) {
    super(name);
  }

  public Reptile(String name, NoiseStrategy noiseStrategy){
    super(name, noiseStrategy);
  }
}
