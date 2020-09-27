package Zoo;

import Animals.Animal;
import Animals.Pachyderm.*;
import Animals.Feline.*;
import Animals.Canine.*;
import Animals.Reptile.*;

public class Zoo {
  // here are all of the animals
  
  // <!-- Example of identity, as each object has a distinctive feature - their name! -->

  // STRATEGY PATTEN IMPLEMENTATION DETAILS:

  // Each animal has the option of being instantiated with one of the noise strategies.
  // There is a mix, some Animal Types have default makeNoise(), some individual species
  // have default makeNoise(), and some don't allow for this custom makeNoise() just
  // to show off the options when making a strategy.

  
  Animal elephant = new Elephant("Ellie");
  Animal elephant2 = new Elephant("Edward");
  Animal hippo = new Hippo("Hippy");
  Animal hippo2 = new Hippo("Harold", new HippoNoiseStrategy());
  Animal rhino = new Rhino("Renee");
  Animal rhino2 = new Rhino("Rex");

  Animal cat = new Cat("Candy");
  Animal cat2 = new Cat("Conan", new MeowNoiseStrategy());
  Animal lion = new Lion("Lionel");
  Animal lion2 = new Lion("Leah", new RoarNoiseStrategy());
  Animal tiger = new Tiger("Turbo");
  Animal tiger2 = new Tiger("Tina", new GwraaNoiseStrategy());

  Animal dog = new Dog("Daniel");
  Animal dog2 = new Dog("Danielle", new WoofNoiseStrategy());
  Animal wolf = new Wolf("Weston");
  Animal wolf2 = new Wolf("Wanda", new HowlNoiseStrategy());

  Animal snake = new Snake("Samantha");
  Animal snake2 = new Snake("Scott", new SlitherNoiseStrategy());
  Animal turtle = new Turtle("Teresa");
  Animal turtle2 = new Turtle("Trent", new SnapNoiseStrategy());

  Animal[] animals = {elephant, elephant2, hippo, hippo2, rhino, rhino2, cat, cat2, lion, lion2, tiger, tiger2, dog, dog2, wolf, wolf2, snake, snake2, turtle, turtle2};

  ZooEmployee employee = new Zookeeper("Jeff");

  public void go(int days) {
    for (int i = 0; i < days; i++){
      System.out.println("\nIt is Day " + (i+1) + ".\n");
      employee.arrive();
      System.out.println("\n");
      // employee.wakeAnimals(animals);
      System.out.println("\n");
      employee.rollCallAnimals(animals);
      System.out.println("\n");
      // employee.feedAnimals(animals);
      System.out.println("\n");
      // employee.exerciseAnimals(animals);
      System.out.println("\n");
      // employee.tellAnimalsToSleep(animals);
      System.out.println("\n");
      employee.leave();
    }
  }

}