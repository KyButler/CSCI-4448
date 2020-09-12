package Animals.Feline;

public class Cat extends Feline {
  public Cat() {
    super("Cat the Cat");
  }

  public Cat(String name) {
    super(name + " the Cat");
  }

  public void makeNoise() {
    System.out.println("Meow!");
  }
}
