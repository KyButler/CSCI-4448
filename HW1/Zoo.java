import Animals.*;
import Animals.Pachyderm.*;

public class Zoo {
  // here are all of the animals

  Animal elephant1 = new Elephant("Ellie");
  Animal elephant2 = new Elephant("Jiggy");

  Animal hippo1 = new Hippo("Lola");
  Animal hippo2 = new Hippo("Maddox");

  Animal rhino1 = new Rhino("Renee");
  Animal rhino2 = new Rhino("Tank");

  Animal[] animals = {elephant1, elephant2, hippo1, hippo2, rhino1, rhino2};

  public void wakeUpRoutine() {
    for(int i = 0; i < animals.length; i++) {
      animals[i].wake();
    }
  }

}