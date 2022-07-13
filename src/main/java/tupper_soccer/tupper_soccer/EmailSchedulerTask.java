package tupper_soccer.tupper_soccer;

import java.util.TimerTask;

public class EmailSchedulerTask extends TimerTask {
  public void run() {
    String template = "<html><head></head><body><h1>TEMPLATE</h1></body></html>";
    System.out.println("Sending template: " + template);
  }
}
