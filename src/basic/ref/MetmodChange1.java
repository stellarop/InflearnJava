package basic.ref;

public class MetmodChange1 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : " + dataA.value);
        // dataA의 참조값을 changeReference() 메서드에 전달
        changeReference(dataA);
        System.out.println("메서드 호출 후 : " + dataA.value);

    }

    public static void changeReference(Data dataX){
        // dataA의 참초값을 가진 dataX 변수의 필드를 변경
        dataX.value = 20;
    }
}
