package Intermediate1.lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress address1 = new ImmutableAddress("서울");
        // 주소값 대입을 막을 수 있는 방법은 없다
        ImmutableAddress address2 = address1;

        System.out.println("address1 : " + address1);
        System.out.println("address2 : " + address2);
        // 불변 객체의 값을 변경하고 싶다면 변경 하고 싶은 값으로 새로운 불변 객체를 생성해야 한다
        address2 = new ImmutableAddress("부산");

        System.out.println("부산 -> address2");
        System.out.println("address1 : " + address1);
        System.out.println("address2 : " + address2);
    }

}
