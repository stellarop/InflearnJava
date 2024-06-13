package Intermediate1.nested.anonymous;

import Intermediate1.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        // 지역 변수
        int localVar = 1;

        // 익명 클래스
        // Printer 라는 이름의 인터페이스를 구현한 익명클래스
        // Printer 인터페이스를 상속과 동시에 구현, 생성
        Printer printer = new Printer() {
            int value = 0;

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
        };

        printer.print();
        System.out.println("printer.class : " + printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(2);
    }
}
