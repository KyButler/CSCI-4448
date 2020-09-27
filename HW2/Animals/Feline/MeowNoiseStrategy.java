package Animals.Feline;

import Animals.NoiseStrategy;

public class MeowNoiseStrategy implements NoiseStrategy {
  public void makeNoise() {
    System.out.println("Meow!");
  }
}
