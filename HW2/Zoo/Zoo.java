package Zoo;

import Animals.Animal;
import Animals.Pachyderm.*;
import Animals.Feline.*;
import Animals.Canine.*;
import Animals.Reptile.*;

import java.util.ArrayList;
import java.util.Collection;

public class Zoo {
  // here are all of the animals

  // <!-- Example of identity, as each object has a distinctive feature - their
  // name! -->

  // STRATEGY PATTEN IMPLEMENTATION DETAILS:

  // Each animal has the option of being instantiated with one of the noise
  // strategies.
  // There is a mix, some Animal Types have default makeNoise(), some individual
  // species
  // have default makeNoise(), and some don't allow for this custom makeNoise()
  // just
  // to show off the options when making a strategy.

  private Collection<Animal> Animals = new ArrayList<Animal>();
  private Zookeeper employee;
  private ZooClock clock;
  private ZooFoodServer server;

  public Zoo() {
    employee = new Zookeeper("Jeff");
    server = new ZooFoodServer("Michelle");

    Animals.add(new Elephant("Ellie"));
    Animals.add(new Elephant("Edward"));
    Animals.add(new Hippo("Hippy"));
    Animals.add(new Hippo("Harold", new HippoNoiseStrategy()));
    Animals.add(new Rhino("Renee"));
    Animals.add(new Rhino("Rex"));

    Animals.add(new Cat("Candy"));
    Animals.add(new Cat("Conan", new MeowNoiseStrategy()));
    Animals.add(new Lion("Lionel"));
    Animals.add(new Lion("Leah", new RoarNoiseStrategy()));
    Animals.add(new Tiger("Turbo"));
    Animals.add(new Tiger("Tina", new GwraaNoiseStrategy()));

    Animals.add(new Dog("Daniel"));
    Animals.add(new Dog("Danielle", new WoofNoiseStrategy()));
    Animals.add(new Wolf("Weston"));
    Animals.add(new Wolf("Wanda", new HowlNoiseStrategy()));

    Animals.add(new Snake("Samantha"));
    Animals.add(new Snake("Scott", new SlitherNoiseStrategy()));
    Animals.add(new Turtle("Teresa"));
    Animals.add(new Turtle("Trent", new SnapNoiseStrategy()));

    clock = new ZooClock();
  }

  public void go(int days) {
    for (int i = 0; i < days; i++) {
      System.out.println("\nIt is Day " + (i + 1) + ".\n");

      for (int j = 0; j < 24; j++) {
        int currentTime = clock.getTime();

        String time = "";

        if (currentTime >= 8 && currentTime <= 20) {
          if (currentTime >= 12) {
            if (currentTime == 12) {
              time = "12 PM";
            } else {
              time = currentTime - 12 + " PM";
            }
          } else {
            time = currentTime + " AM";
          }
          System.out.println("\nIt is now " + time);
        }

        switch (clock.getTime()) {
          case 8:
            System.out.println("\n");
            employee.arrive();
            server.arrive();
            break;
          case 9:
            System.out.println("\n");
            employee.wakeAnimals(Animals);
            break;
          case 10:
            System.out.println("\n");
            employee.rollCallAnimals(Animals);
            System.out.println("\n");
            server.makeFood();
            break;
          case 12:
            System.out.println("\n");
            server.serveFood();
            break;
          case 13:
            System.out.println("\n");
            employee.exerciseAnimals(Animals);
            System.out.println("\n");
            server.clean(); 
            break;
          case 15:
            System.out.println("\n");
            employee.feedAnimals(Animals);
            System.out.println("\n");
            server.makeFood();
            break;
          case 17:
            System.out.println("\n");
            server.serveFood();
            break;
          case 18:
            System.out.println("\n");
            server.clean();
            break;
          case 19:
            System.out.println("\n");
            employee.tellAnimalsToSleep(Animals);
            break;
          case 20:
            System.out.println("\n");
            employee.leave();
            server.leave();
            break;
          case 24:
            clock.resetTime();
            break;
          default:
            break;
        }
        clock.nextHour();
      }
    }
  }
}