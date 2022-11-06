package school.mjc.stage0.conditions.finalTask;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysInMonth {
    public void printDays(int year, int month) {
       /* switch (month) {
            case 1: Calendar.JANUARY; break;
            case 2: Calendar.FEBRUARY; break;
            case 3: Calendar.MARCH; break;
            case 4: Calendar.APRIL; break;
            case 5: Calendar.MAY; break;
            case 6: Calendar.JUNE; break;
            case 7: Calendar.JULY; break;
            case 8: Calendar.AUGUST; break;
            case 9: Calendar.SEPTEMBER; break;
            case 10: Calendar.OCTOBER; break;
            case 11: Calendar.NOVEMBER; break;
            case 12: Calendar.DECEMBER; break;
        }*/
        if(year > 0 && month > 0 && month <= 12) {
            Calendar mycal = new GregorianCalendar(year, month-1,1);
            int days = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(days);
        } else {
            System.out.println("invalid date");
        }

    }
}
