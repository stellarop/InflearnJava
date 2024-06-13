package Intermediate1.change.ex;

public class MyDateMain {
    public static void main(String[] args) {
        // 불변 객체 값 삽입
        MyDate myDate1 = new MyDate(2024,4,8);
        // 불변 객체 주소 값에 updateDate() 메서드에 값을 넣어주면 삽입한 값이
        // 들어간 새로운 객체의 주소값을 리턴 받는다.
        MyDate myDate2 = myDate1.updateDate(2025, 5, 9);

        System.out.println(myDate1.toString());
        System.out.println(myDate2.toString());
    }
}
