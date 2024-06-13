package Intermediate1.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj result = immutableObj.add(20);

        // 계산 이후에도 기존 값과 신규 값 모두 확인 가능
        // 불변 객체에 값을 변경하려면 기존 객체의 값을 그대로 두고 변경된 결과를 새로운 객체에 담아서 리턴
        System.out.println(immutableObj.getValue());
        System.out.println(result.getValue());

    }
}
