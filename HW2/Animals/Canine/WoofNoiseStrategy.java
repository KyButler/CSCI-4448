package Animals.Canine;

import Animals.NoiseStrategy;

public class WoofNoiseStrategy implements NoiseStrategy{
  public void makeNoise() {
    System.out.println("Woof!");
  }
}
