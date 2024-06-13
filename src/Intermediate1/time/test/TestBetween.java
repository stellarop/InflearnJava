package Intermediate1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 11, 21);

        Period between = Period.between(start, end);

        System.out.println("시작 날짜 : " + start);
        System.out.println("종료 날짜 : " + end);

        System.out.println("남은 기간 : " + between.getYears() + "년 " + between.getMonths()
                + "개월 " + between.getDays() + "일");

        long between1 = ChronoUnit.DAYS.between(start, end);
        System.out.println("D : " + between1);



    }
}
