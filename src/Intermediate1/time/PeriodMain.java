package Intermediate1.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period : " + period);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plus = currentDate.plus(period);
        System.out.println("currentDate : " + currentDate);
        System.out.println("plus : " + plus);

        // 기간의 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 1);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 : " + between.getMonths() + "개월 " + between.getDays() + "일");

    }
}
