package Animals.Reptile;

public class Turtle extends Reptile { 
  public Turtle() {
    super ("Turtle the Turtle");
  }

  public Turtle(final String name) { 
    super(name + " the Turtle");
  }

  public void makeNoise() {
    System.out.println("Snap snap!");
  }

  public void eat() {
    System.out.println(this.getName() + " eats their lettuce!");
  }

  public void exercise() {
    System.out.println(this.getName() + " wins a race against a rabbit!");
  }
}