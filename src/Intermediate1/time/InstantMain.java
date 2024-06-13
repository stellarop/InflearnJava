package Intermediate1.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        // UTC 기준 날짜
        Instant now = Instant.now();
        System.out.println("now : " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from : " + from);

        Instant epInstant = Instant.ofEpochSecond(0);
        System.out.println("epInstant : " + epInstant);

        Instant later = epInstant.plusSeconds(3600);
        System.out.println("later : " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond : " + laterEpochSecond);
    }
}
