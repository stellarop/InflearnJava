package Intermediate1.nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        // 지역 변수
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            // 지역 클래스는 지역 변수에 접근 가능

            @Override
            public void print() {
                System.out.println("value : " + value);
                System.out.println("local : " + localVar);
                // 파라메터도 접근 가능(지역 변수랑 같음)
                System.out.println("paramVar : " + paramVar);
                // 지역 클래스도 내부 클래스이기 때문에 바깥 클래스 인스턴스를 참조하여
                // 바깥 클래스 필드에 접근 가능
                System.out.println("outInstanceVar : " + outInstanceVar);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();

    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
