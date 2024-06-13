package Intermediate1.change;

public class ImmutableObj {
    // 불변 객체 필드는 값이 절대 바뀌면 안된다
    private final int value;


    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        // 기존 값 + 더한 값을 변수에 담고
        int result = value + addValue;
        // 인스턴스를 새로 생성해서 값을 넣어준 후 리턴한다.
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

}
