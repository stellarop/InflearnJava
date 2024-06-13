package basic.oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        valueUp(data);
        valueUp(data);
        valueUp(data);
        System.out.println("최종 수 : " + data.value);

    }

    static void valueUp(ValueData data){
        data.value++;
        System.out.println("숫자 증가 : " + data.value);
    }
}
