package Zoo;

import Animals.Animal;

import java.util.Collection;

public abstract class ZooEmployee {
  // each zoo employee has a name
  private String name;

  public ZooEmployee() {
    this.name = "Zoo Employee";
  }

  public ZooEmployee(String name) {
    this.name = name;
  }

  public void wakeAnimals(Collection<Animal> animals) {
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
    for (Animal animal : animals) {
      System.out.println(this.name + " calls out for " + animal.getName());
      animal.makeNoise();
    }
  }

  public void feedAnimals(Collection<Animal> animals) {
    for (Animal animal : animals) {
      System.out.println(this.name + " feeds " + animal.getName());
      animal.eat();
    }
  }

  public void exerciseAnimals(Collection<Animal> animals) {
    for (Animal animal : animals) {
      System.out.println(this.name + " goes to exercise with " + animal.getName());
      animal.exercise();
    }
  }

  public void tellAnimalsToSleep(Collection<Animal> animals) {
    for (Animal animal : animals) {
      System.out.println(this.name + " tells " + animal.getName() + " to sleep.");
      animal.sleep();
    }
  }

  public void arrive() {
    System.out.println(this.name + " is arriving at the zoo.");
  }

  public void leave() {
    System.out.println(this.name + " is leaving the zoo.");
  }
}
