package Intermediate1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        // 지역 변수
        // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다
        int localVar = 1;
        // 지역 클래스가 접근하는 지역 변수는 중간에 값이 변하면 안된다
        // final 로 선언하거나 사실상 final 이여야 함
        // localVar = 2;

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

                // 인스턴스는 지역 변수보다 더 오래 살아남음
                System.out.println("outInstanceVar : " + outInstanceVar);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        // 만약 localVar 의 값을 변경한다면?
        // 캡쳐 변수의 값을 변경하지 못하는 이유
        // 지역 변수의 값을 변경하면 인스턴스에 캡쳐한 변수의 값도 변경
        // 반대로 인스턴스에 있는 캡쳐 변수의 값을 변경하면 지역 변수의 값도 다시 변경해야함
        // 지역 변수의 값과 인스턴스에 있는 캡쳐 변수의 값을 서로 동기화 해야 하는데
        // 멀티 쓰레드 상황에서 동기화는 어렵고 성능에 나쁜 영향을 준다
        // localVar = 10;
        // paramVar = 20;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer process = localOuterV1.process(2);
        // process() 메서드의 스택 프레임이 사라진 이후에 실행

        // 스택 프레임이 사라진 이후에 실행을 해도 값이 출력이 된다.
        // 지역 클래스의 인스턴스를 생성할 때 지역 클래스가 접근하는 지역 변수 확인
        // 지역 변수 복사(캡쳐)
        // 복사된 지역 변수 인스턴스 변수에 포함
        // 실행을 하게 되면 스택 프레임이 끝난 지역 변수에 접근 하는게 아닌 미리 캡쳐가 된
        // 지역 변수에 접근해서 실행
        process.print();

        // 추가
        System.out.println("필드 확인");
        Field[] declaredFields = process.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredFields : " + declaredField);
        }
    }
}
