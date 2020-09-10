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
}
