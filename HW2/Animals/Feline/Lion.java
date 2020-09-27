package Animals.Feline;

import Animals.NoiseStrategy;

public class Lion extends Feline {
  public Lion() {
    super("Lion the Lion");
  }

  public Lion(String name) {
    super(name + " the Lion");
  }

  public Lion(String name, NoiseStrategy noiseStrategy){
    super (name + " the Lion", noiseStrategy);
  }

  public void exercise() {
    System.out.println(this.getName() + " walks around menacingly, showing off their mane!");
  }
}
