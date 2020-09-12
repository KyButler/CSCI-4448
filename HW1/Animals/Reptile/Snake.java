package Animals.Reptile;

public class Snake extends Reptile {
  public Snake() {
    super ("Snake the Snake");
  }

  public Snake(final String name) {
    super(name + " the Snake");
  }

  public void makeNoise() {
    System.out.println("Slither slither!");
  }

  public void eat() {
    System.out.println(this.getName() + " eats a mouse . . ew!");
  }

  public void exercise() {
    System.out.println(this.getName() + " . . . do snakes even exercise?");
  }
}
