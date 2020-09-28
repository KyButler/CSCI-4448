package Animals.Reptile;

import Animals.NoiseStrategy;

public class Turtle extends Reptile { 
  public Turtle() {
    super ("Turtle the Turtle");
  }

  public Turtle(String name) { 
    super(name + " the Turtle");
  }

  public Turtle(String name, NoiseStrategy noiseStrategy){
    super(name + " the Turtle", noiseStrategy);
  }

  public void eat() {
    System.out.println(this.getName() + " eats their lettuce!");
  }

  public void exercise() {
    System.out.println(this.getName() + " wins a race against a rabbit!");
  }
}