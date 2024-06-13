package Intermediate1.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자로
        LocalDateTime ldt = LocalDateTime.of(2024, 12, 31,
                13, 30, 59);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern
                ("yyyy-MM-dd HH:mm:ss");

        String format = ldt.format(dateTimeFormatter);
        System.out.println("포맷팅 날짜 : " + format);

        // 파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parse = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("문자열 파싱 날짜 : " + parse);
    }
}
