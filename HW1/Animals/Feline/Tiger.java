package Animals.Feline;

public class Tiger extends Feline {
  public Tiger() {
    super("Tiger the Tiger");
  }

  public Tiger(String name) {
    super(name + " the Tiger");
  }

  public void makeNoise() {
    System.out.println("Gwraaaaa!");
  }

  public void exercise() {
    System.out.println(this.getName() + " runs around restlessly!");
  }
}
