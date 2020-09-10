package Zoo;

import Animals.Animal;
import Animals.Pachyderm.*;

public class Zoo {
  // here are all of the animals
  
  Animal elephant = new Elephant("Ellie");

  Animal hippo = new Hippo("Hippy");

  Animal rhino = new Rhino("Renee");

  Animal[] animals = {elephant, hippo, rhino};

  ZooEmployee employee = new Zookeeper("Jeff");

  public void go(int days) {
    for (int i = 0; i < days; i++){
      System.out.println("\nIt is Day " + i + ".\n");

      employee.wakeAnimals(animals);
      System.out.println("\n");
      employee.rollCallAnimals(animals);
      System.out.println("\n");
      employee.feedAnimals(animals);
    }
  }

}