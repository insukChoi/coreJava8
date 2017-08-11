package ch2.exercise;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 달력 출력 프로그램을 수정해서 일요일부터 한 주를 시작하게 하라.
 * 또한, 줄 넘김을 한 번만 출력하게 만든다.
 */
public class ex1 {

    public static void main(String[] args) {

        int year = 2017;
        int month = 8;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek firstDayWeek = date.getDayOfWeek();
        DayOfWeek tempWeekday = null;

        // 요일 한국어로 출력
        System.out.println("\t일\t월\t화\t수\t목\t금\t토");

        // 1일이 어떤 요일인지에 따라 시작 위치를 고정
        for(int i=1; i < firstDayWeek.getValue(); i++){
            if(i < 2){
                System.out.print("\t\t");
            }
        }

        // 출력
        while (date.getMonthValue() == month){
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);

            tempWeekday = date.getDayOfWeek();
            int value = tempWeekday.getValue();
            if(value == 7){
                System.out.println("");
            }

        }
    }

}
