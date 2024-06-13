package Intermediate1.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        // 현재 운영체제의 맞는 타임존
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault : " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId : " + seoulZoneId);
    }
}
