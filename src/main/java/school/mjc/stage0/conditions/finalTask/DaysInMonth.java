package school.mjc.stage0.conditions.finalTask;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if(year > 0) {
            Calendar mycal = new GregorianCalendar(year, month,1);
            int days = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(days);
        } else {
            System.out.println("invalid date");
        }

    }
}
