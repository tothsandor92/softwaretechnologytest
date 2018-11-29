import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;

public class WeekdayCalculator {

    private static ArrayList<String> dayNames;
   static {
        dayNames=new ArrayList<>();
        dayNames.add(0, "Monday");
        dayNames.add(1, "Tuesday");
        dayNames.add(2, "Wednesday");
        dayNames.add(3, "Thursday");
        dayNames.add(4, "Friday");
        dayNames.add(5, "Saturday");
        dayNames.add(6, "Sunday");
    }



    public static String calculateDay(Date date){
        int startingDate=1900;
    int currentYear=date.getYear();
    long dayCounter=0;

        for (int i = startingDate; i <currentYear-startingDate ; i++) {
            if(isLeapYear(i)){
                dayCounter+=366;
            }
            else dayCounter+=365;
        }
        for (int i = 1; i <date.getMonth() ; i++) {
            YearMonth yearMonth= YearMonth.of(currentYear,i);
            dayCounter+=yearMonth.lengthOfMonth();
        }
        dayCounter+=date.getDay();
 int currentDay=(int) (dayCounter%7);
        System.out.println(currentDay);

        System.out.println(dayNames.get(currentDay));
        return (dayNames.get((int) (dayCounter%7)-1));


    }

      private static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

}
