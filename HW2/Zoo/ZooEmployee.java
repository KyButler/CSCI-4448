package Zoo;

import Animals.Animal;

public abstract class ZooEmployee {
  // each zoo employee has a name
  private String name;

  public ZooEmployee() {
    this.name = "Zoo Employee";
  }

  public ZooEmployee(String name) {
    this.name = name;
  }

  public void wakeAnimals(Animal[] animals) {
    for (int i = 0; i < animals.length; i++) {
      System.out.println(this.name + " is waking up " + animals[i].getName());

      // <!-- Example of an abstraction, wake does the underlying functions without needing to know the implementation details! -->
      // <!-- Example of polymorphism, as every Animal instance can be issued a method call regardless of their subclasses. -->
      animals[i].wake();
    }
  }

  public void rollCallAnimals(Animal[] animals) {
    for (int i = 0; i < animals.length; i++) {
      System.out.println(this.name + " calls out for " + animals[i].getName());
      animals[i].makeNoise();
    }
  }

  public void feedAnimals(Animal[] animals) {
    for (int i = 0; i < animals.length; i++) {
      System.out.println(this.name + " feeds " + animals[i].getName());
      animals[i].eat();
    }
  }

  public void exerciseAnimals(Animal[] animals) {
    for (int i = 0; i < animals.length; i++) {
      System.out.println(this.name + " goes to exercise with " + animals[i].getName());
      animals[i].exercise();
    }
  }

  public void tellAnimalsToSleep(Animal[] animals){
    for (int i = 0; i < animals.length; i++) {
      System.out.println(this.name + " tells " + animals[i].getName() + " to sleep.");
      animals[i].sleep();
    }
  }

  public void arrive(){
    System.out.println(this.name + " is arriving at the zoo.");
  }

  public void leave(){
    System.out.println(this.name + " is leaving the zoo.");
  }  
}

