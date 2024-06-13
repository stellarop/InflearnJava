package Intermediate1.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        // 동일성 == 연산자를 사용해서 두 객체의 참조가 동일한 객체인지 확인
        System.out.println("identity : " + (userV1 == userV2));
        // 동등성 equals() 메서드를 사용해서 두 객체가 논리적으로 동등한지 확인
        System.out.println("equality : " + (userV1.equals(userV2)));

    }
}
