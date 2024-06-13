package basic.ref;

public class NullMain1 {
    public static void main(String[] args) {

        // Data 객체 null 초기화
        Data data = null;
        System.out.println("1. data : " + data);

        // data 변수에 참조값 대입
        data = new Data();
        System.out.println("2. data : " + data);

        // 다시 null 로 초기화
        data = null;
        System.out.println("3. data : " + data);

    }
}
