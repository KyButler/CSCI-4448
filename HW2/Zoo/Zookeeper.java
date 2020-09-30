package Zoo;

import Animals.Animal;

import java.util.Collection;

public class Zookeeper extends ZooEmployee {
  public Zookeeper(String name) {
    super(name + " the Zookeeper");
  }

  public void wakeAnimals(Collection<Animal> animals) {
    observer.eventAnnouncment(this.name, "wake the animals");

    for (Animal animal : animals) {
      System.out.println(this.name + " is waking up " + animal.getName());

      // <!-- Example of an abstraction, wake does the underlying functions without
      // needing to know the implementation details! -->
      // <!-- Example of polymorphism, as every Animal instance can be issued a method
      // call regardless of their subclasses. -->
      animal.wake();
    }
  }

  public void rollCallAnimals(Collection<Animal> animals) {
    observer.eventAnnouncment(this.name, "rollcall the animals");

    for (Animal animal : animals) {
      System.out.println(this.name + " calls out for " + animal.getName());
      animal.makeNoise();
    }
  }

  public void feedAnimals(Collection<Animal> animals) {
    observer.eventAnnouncment(this.name, "feed the animals");
    for (Animal animal : animals) {
      System.out.println(this.name + " feeds " + animal.getName());
      animal.eat();
    }
  }

  public void exerciseAnimals(Collection<Animal> animals) {
    observer.eventAnnouncment(this.name, "exercise the animals");
    for (Animal animal : animals) {
      System.out.println(this.name + " goes to exercise with " + animal.getName());
      animal.exercise();
    }
  }

  public void tellAnimalsToSleep(Collection<Animal> animals) {
    observer.eventAnnouncment(this.name, "put the animals to bed");
    for (Animal animal : animals) {
      System.out.println(this.name + " tells " + animal.getName() + " to sleep.");
      animal.sleep();
    }
  }
}
