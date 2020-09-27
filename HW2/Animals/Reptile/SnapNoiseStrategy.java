package Animals.Reptile;

import Animals.NoiseStrategy;

public class SnapNoiseStrategy implements NoiseStrategy{
  public void makeNoise() {
    System.out.println("Snap Snap!");
  }
}
