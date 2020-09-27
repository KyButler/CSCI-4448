package Animals.Canine;

import Animals.NoiseStrategy;

public class BarkNoiseStrategy implements NoiseStrategy{
  public void makeNoise() {
    System.out.println("Bark Bark!");
  }
}
