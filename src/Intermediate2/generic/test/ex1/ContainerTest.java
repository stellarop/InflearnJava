package Intermediate2.generic.test.ex1;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈 값 확인 : " + stringContainer.isEmpty());

        Container<String> stringContainer2 = new Container<>();
        stringContainer2.setData("data2");
        System.out.println("저장 데이터 : " + stringContainer2.getData());
        System.out.println("빈 값 확인 : " + stringContainer2.isEmpty());

        Container<Integer> stringContainer3 = new Container<>();
        stringContainer3.setData(10);
        System.out.println("저장 데이터 : " + stringContainer3.getData());
        System.out.println("빈 값 확인 : " + stringContainer3.isEmpty());

    }
}
