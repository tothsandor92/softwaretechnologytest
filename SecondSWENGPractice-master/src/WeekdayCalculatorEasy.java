import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class WeekdayCalculatorEasy {

    private static ArrayList<String> dayNames;
    {
        dayNames.add(0, "Monday");
        dayNames.add(1, "Tuesday");
        dayNames.add(2, "Wednesday");
        dayNames.add(3, "Thursday");
        dayNames.add(4, "Friday");
        dayNames.add(5, "Saturday");
        dayNames.add(6, "Sunday");
    }

    public static String getDay(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);
        return dayNames.get(dayOfWeek);
    }

}
