package Intermediate1.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate ld = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        System.out.println("dayOfWeek : " + dayOfWeek);

        DayOfWeek with = ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("with : " + with);


    }
}
