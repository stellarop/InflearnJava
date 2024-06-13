package Intermediate1.lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address address1 = new Address("서울");
        Address address2 =  new Address("서울");

        System.out.println("address1 : " + address1);
        System.out.println("address2 : " + address2);

        // address2의 주소를 변경하면 같은 인스턴스를 참조하는 address1도 같이 변경(얕은 복사)
        // 깊은 복사로 진행하려면 Cloneable 인터페이스 구현, 복사 생성자, 복사 팩토리 등등..
        change(address2, "부산");
        System.out.println("부산 -> address2");
        System.out.println("address1 : " + address1);
        System.out.println("address2 : " + address2);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
