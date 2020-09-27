package Animals.Pachyderm;

public class Hippo extends Pachyderm {
  public Hippo() {
    super("Hippo the Hippo");
  }

  public Hippo(String name) {
    super(name + " the Hippo");
  }

  public void makeNoise() {
    System.out.println("<excited hippo noise>");
  }
}
