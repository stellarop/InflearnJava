package Intermediate1.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 11);

        System.out.println("오늘 날짜 : " + nowDate);
        System.out.println("지정 날짜 : " + ofDate);

        // 날짜 계산(불변)
        // 모든 날짜 클래스는 불변이므로 리턴 값을 무조건 받아야 함(새로운 객체를 생성해서 리턴 해주기 때문)
        ofDate = ofDate.plusDays(20);
        System.out.println("지정 날짜 + 20 : " + ofDate);
    }
}
