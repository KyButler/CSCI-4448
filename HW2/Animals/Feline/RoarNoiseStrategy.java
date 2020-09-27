package Animals.Feline;

import Animals.NoiseStrategy;

public class RoarNoiseStrategy implements NoiseStrategy {
  public void makeNoise() {
    System.out.println("ROAR!");
  }
}
