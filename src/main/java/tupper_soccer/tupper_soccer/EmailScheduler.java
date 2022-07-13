package tupper_soccer.tupper_soccer;
import java.time.*;
import java.util.Date;
import java.time.temporal.TemporalAdjusters;
import java.util.Timer;
import java.util.TimerTask;
import tupper_soccer.tupper_soccer.EmailSchedulerTask;

public class EmailScheduler extends Timer {

  public void schedule () {
    EmailSchedulerTask emailTask = new EmailSchedulerTask();
    LocalDateTime locNextThursdayNoon = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY)).atTime(12, 0);
    Instant instNextThursdayNoon = locNextThursdayNoon.toInstant(ZoneOffset.of(ZoneId.systemDefault().getId());
    Date nextThursdayNoon = Date.from(instNextThursdayNoon);
    System.out.println(nextThursdayNoon);
    super.schedule(emailTask, nextThursdayNoon);
  }

}
