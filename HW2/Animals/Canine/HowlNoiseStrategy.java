package Animals.Canine;

import Animals.NoiseStrategy;

public class HowlNoiseStrategy implements NoiseStrategy{
  public void makeNoise() {
    System.out.println("Howlll!");
  }
}
