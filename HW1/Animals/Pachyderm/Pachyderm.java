package Animals.Pachyderm;

import Animals.Animal;
import java.util.Random;

public abstract class Pachyderm extends Animal {
  public Pachyderm(String name) {
    super(name);
  }

  public void makeNoise() {
    System.out.println("<trumpet noise ensues>");
  }

  public void eat() {
    System.out.println(this.getName() + " ate their grass!");
  }

  public void exercise() {
    // https://www.geeksforgeeks.org/generating-random-numbers-in-java/

    final Random rand = new Random();
    final double x = rand.nextDouble() * 100;
    int randomNum = (int) x;
    randomNum += 1; // this makes the possible values range from 1 - 100

    if (randomNum < 25) {
      System.out.println(this.getName() + " CHAAARGED, RUN AWAAAAAAAAY!");
    } else {
      System.out.println(this.getName() + " splashes around in water!");
    }
  }
}
