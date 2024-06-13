package Intermediate1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);

        System.out.println("현재 날짜 시간 : " + nowDt);
        System.out.println("지정 날짜 시간 : " + ofDt);

        // 날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();

        System.out.println("localDate : " + localDate);
        System.out.println("localTime : " + localTime);

        // 날짜 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime : " + localDateTime);
        
        // 계산(불변)
        LocalDateTime ofDtPlus= ofDt.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000일 : " + ofDtPlus);
        LocalDateTime ofDtPlusYears = ofDt.plusYears(1);
        System.out.println("지정 날짜 시간 + 1년 : " + ofDtPlusYears);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isAfter(ofDt));
        // isEqual() 는 객체가 다르고 타임존이 달라도 시간적으로 같으면 true 를 리턴한다
        // equal() 는 객체 타입, 타임존 내부 데이터의 모든 구성요소가 같아야 true 를 리턴한다
        System.out.println("현재 날짜 시간이 지정 날짜 시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
