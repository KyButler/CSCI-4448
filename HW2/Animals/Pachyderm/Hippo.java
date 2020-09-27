package Animals.Pachyderm;

import Animals.NoiseStrategy;

public class Hippo extends Pachyderm {
  public Hippo() {
    super("Hippo the Hippo");
  }

  public Hippo(String name) {
    super(name + " the Hippo");
  }

  public Hippo(String name, NoiseStrategy noiseStrategy) {
    super(name + " the Hippo", noiseStrategy);
  }
}
