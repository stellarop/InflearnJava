package Intermediate1.lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder ad = new ValueAdder();

        // 메서드 체이닝
        // 메서드 체이닝 기법은 메서드가 끝나는 시점에 바로 도트를 찍어서 변수명 생략 가능
        // add() 메서드는 자기 자신의 주소값을 반환
        // 반환된 주소값을 변수에 담아두지 않고 즉시 사용 가능
        int sum = ad.add(1).add(2).add(3).getValue();
        System.out.println("sum : " + sum);

    }
}
