package Zoo;

public abstract class ZooEmployee {
  // each zoo employee has a name
  protected String name;

  protected ZooAnnouncer observer;

  public ZooEmployee() {
    this.name = "Zoo Employee";
  }

  public ZooEmployee(String name) {
    this.name = name;
  }

  public void arrive() {
    System.out.println(this.name + " is arriving at the zoo.");
    observer = new ZooAnnouncer();
  }

  public void leave() {
    System.out.println(this.name + " is leaving the zoo.");
    observer = null;
  }
}
