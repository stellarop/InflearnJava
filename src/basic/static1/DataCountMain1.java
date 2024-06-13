package basic.static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        // 클래스 객체들은 각각 하나씩 생성되기 때문에 count = 1
        Data1 data1 = new Data1("A");
        System.out.println("A count : " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count : " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count : " + data1.count);

    }
}
