package ch2;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by admin on 2017-08-07.
 */
public class MethodDemo {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2017, 8, 8);
        System.out.println("date.plusDays(1) = "+date.plusDays(1));


        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        for (int i=0; i <value; i++){
            System.out.println("   ");
        }


    }
}


