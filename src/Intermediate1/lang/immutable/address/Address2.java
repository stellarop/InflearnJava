package Intermediate1.lang.immutable.address;

public class Address2 {
    private String value;

    // 복사 생성자
    public Address2(Address2 address2){
        System.out.println("복사 생성자 안에서 출력 : " + address2);
        this.value = address2.value;
    }
    public Address2(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
