package Intermediate1.lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address2 address = new Address2("서울");
        Address2 newAddress = new Address2(address);

        System.out.println("주소값 : " + address);
        System.out.println("주소값 : " + newAddress);


        newAddress.setValue("부산");
        System.out.println("깊은 복사 수정 후");

        System.out.println(address.getValue());
        System.out.println(newAddress.getValue());

    }
}
