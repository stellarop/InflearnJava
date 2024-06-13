package Intermediate1.time;

import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChronoFieldMain {
    public static void main(String[] args) {
        for (ChronoField chronoField : ChronoField.values()){
            System.out.println("value : " + chronoField + ", range : " + chronoField.range());
        }

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.DAY_OF_MONTH.range());
    }
}
