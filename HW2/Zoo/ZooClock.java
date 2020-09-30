package Zoo;

public class ZooClock {
  private int time = 0;

  public int getTime() {
    return this.time;
  }

  public void nextHour() {
    this.time++;
  }

  public void resetTime(){
    this.time = 0;
  }

}
