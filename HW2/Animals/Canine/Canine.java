package Animals.Canine;

import Animals.Animal;
import Animals.NoiseStrategy;

public abstract class Canine extends Animal {
  public Canine(String name) {
    super(name, new BarkNoiseStrategy());
  }

  public Canine(String name, NoiseStrategy noiseStrategy){ 
    super(name, noiseStrategy);
  }

  public void eat() {
    System.out.println(this.getName() + " ate a rabbit!");
  }

  public void exercise() {
    System.out.println(this.getName() + " ran with his pals!");
  }
}
