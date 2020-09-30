package Zoo;

// OBSERVER CLASS
// Here the observer pattern is applied, with our anouncement being any string that the user can
// decide when running the application. All the function does then is print out what action
// has taken place by the zookeeper specified by the parameter.

public class ZooAnnouncer {
  protected ZooEmployee zooEmployee;

  public void eventAnnouncment(String zookeeperName, String action) {
    // ex: "Hi, this is the Zoo Announcer. The Zookeeper is about
    // to wake the animals!"

    System.out.println("Hi, this is the Zoo Announcer. " + zookeeperName + " is about to " + action + ".");
  };
}
