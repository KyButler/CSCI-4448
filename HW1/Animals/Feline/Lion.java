package Animals.Feline;

public class Lion extends Feline {
  public Lion() {
    super("Lion the Lion");
  }

  public Lion(String name) {
    super(name + " the Lion");
  }

  public void makeNoise() {
    System.out.println("ROAAAR!");
  }

  public void exercise() {
    System.out.println(this.getName() + " walks around menacingly, showing off their mane!");
  }
}
