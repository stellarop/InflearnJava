package basic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 변수 선언 시즘에 참조값을 할당해서 참조값을 변경할 수 없다
        final Data data = new Data();

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
