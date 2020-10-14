package main.store;

// HERE IS THE OBSERVER CLASS
// Here the observer pattern is applied, with our anouncement being any string that the user can
// decide when running the application. All the function does then is print out what action
// has taken place in the store, specified by the parameter.


public class StoreAnnouncer {
    public void eventAnnouncment(String action) {
        System.out.println("Hi, this is the Store Announcer. The store has officially " + action + ".");
    };
    
}