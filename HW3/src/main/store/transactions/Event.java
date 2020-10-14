package main.store.transactions;

public class Event {
  private int day;
  private String event;
  private String affected;

  public Event(int day, String event, String affected){
    this.day = day;
    this.event = event;
    this.affected = affected;
  }

  public int getDay() {
    return day;
  }

  public String getEvent() {
    return event;
  }

  public String getAffected() {
    return affected;
  }
}
