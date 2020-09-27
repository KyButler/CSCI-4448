package Animals.Feline;

import Animals.NoiseStrategy;

public class PurrNoiseStrategy implements NoiseStrategy{
  public void makeNoise() {
    System.out.println("Purrr!");
  }
}
