package Animals.Canine;

public class Wolf extends Canine {
  public Wolf() {
    super("Wolf the Wolf");
  }

  public Wolf(String name) {
    super(name + " the Wolf");
  }

  public void makeNoise() {
    System.out.println("Howlllllll!");
  }
}
