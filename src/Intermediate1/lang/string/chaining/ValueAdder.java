package Intermediate1.lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addValue){
        // 내부 value 값 누적
        value += addValue;
        // 자기 자신의 주소값 반환
        return this;
    }

    public int getValue() {
        return value;
    }
}
