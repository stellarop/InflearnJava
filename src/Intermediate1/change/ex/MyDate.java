package Intermediate1.change.ex;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;


    // update 메서드(불변 객체 변경이므로 반환값은 클래스)
    public MyDate updateDate(int updateYear, int updateMonth, int updateDay){
        // 수정 값 받아서 새 MyDate 객체 생성 후 주소 값 리턴
        return new MyDate(updateYear,updateMonth, updateDay);
    }
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
