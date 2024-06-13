package Intermediate1.lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        // 동일성 = 서로 다른 객체이기 때문에 false
        System.out.println("identity : " + (user1 == user2));
        // 동일성 = 서로 다른 객체이지만 둘 다 같은 id를 가지고 있다 따라서 동등하다
        System.out.println("equality : " + (user1.equals(user2)));
    }
}
