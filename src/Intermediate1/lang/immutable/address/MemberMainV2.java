package Intermediate1.lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A,B의 주소는 모두 서울
        System.out.println("memberA : " + memberA);
        System.out.println("memberB : " + memberB);

        // 회원 B의 주소를 부산으로 변경
        // 컴파일 오류 -> 불변 객체이므로 주소 인스턴스를 새로 만들어서 넣어줘야함
        // memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.getAddress()");
        System.out.println("memberA : " + memberA);
        System.out.println("memberB : " + memberB);
    }
}
