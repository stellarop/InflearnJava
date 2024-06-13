package basic.static1;

public class DataCountName2 {
    public static void main(String[] args) {

        // counter 인스턴스를 공통으로 사용, 객체 생성마다 count 값 증가
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count : " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count : " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count : " + counter.count);

    }
}
