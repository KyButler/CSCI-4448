package Animals.Canine;

import java.util.Random;

import Animals.NoiseStrategy;

public class Dog extends Canine {
  public Dog() {
    super("Dog the Dog");
  }

  public Dog(final String name) {
    super(name + " the Dog", new WoofNoiseStrategy());
  }

  public Dog(String name, NoiseStrategy noiseStrategy) {
    super(name + " the Dog", noiseStrategy);
  }

  public void eat() {
    System.out.println(this.getName() + " eats dog food!");
  }

  // special case for dogs
  public void exercise() {
    // https://www.geeksforgeeks.org/generating-random-numbers-in-java/

    final Random rand = new Random();
    final double x = rand.nextDouble() * 100;
    int randomNum = (int) x;
    randomNum += 1; // this makes the possible values range from 1 - 100

    if (randomNum < 25) {
      System.out.println(this.getName() + " dug a hole!");
    } else {
      System.out.println(this.getName() + " played fetch!");
    }

  }
}
