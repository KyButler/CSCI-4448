package Animals.Pachyderm;

public class Elephant extends Pachyderm {
  public Elephant() {
    super ("Elephant the Elephant");
  }

  public Elephant(String name) {
    super(name + " the Elephant");
  }

  public void exercise() {
    System.out.println(this.getName() + " splashes around with their trunk!");
  }
}
