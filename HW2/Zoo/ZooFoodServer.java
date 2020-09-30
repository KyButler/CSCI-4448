package Zoo;

public class ZooFoodServer extends ZooEmployee {
  public ZooFoodServer() {
    super("The ZooFoodServer");
  }

  public ZooFoodServer(String name) {
    super(name + " the ZooFoodServer");
  }

  public void makeFood() {
    System.out.println("Food server " + this.name + " is making food.");
  }

  public void serveFood() {
    observer.eventAnnouncment(this.name, "serve a meal!");
    System.out.println("Food server " + this.name + " is serving food.");
  }

  public void clean() {
    System.out.println("Food server " + this.name + " is cleaning up the mess from the past meal.");
  }

}
