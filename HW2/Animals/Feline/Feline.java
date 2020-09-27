package Animals.Feline;

import Animals.Animal;
import java.util.Random;

public abstract class Feline extends Animal {
  public Feline(String name) {
    super(name);
  }

  public void makeNoise() {
    System.out.println("Purrr!");
  }

  public void eat() {
    System.out.println(this.getName() + " ate their fish!");
  }

  public void exercise() {
    System.out.println(this.getName() + " chased a ball of yarn!");
  }

  public void sleep() {
    // https://www.geeksforgeeks.org/generating-random-numbers-in-java/

    final Random rand = new Random();
    final double x = rand.nextDouble() * 100;
    int randomNum = (int) x;
    randomNum += 1; // this makes the possible values range from 1 - 100

    if (randomNum < 30) {
      this.exercise(); // 30% chance of 'roaming', which we called 'exercise'
    } else if (randomNum >= 30 && randomNum < 60) {
      this.makeNoise(); // 30% chance of making a noise.
    } else {
      System.out.println(this.getName() + " is going to bed.");
    }
  }
}
