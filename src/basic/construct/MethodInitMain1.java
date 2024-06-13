package basic.construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 16;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 18;
        member2.grade = 70;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members){
            System.out.println("이름 : " + member.name);
            System.out.println("나이 : " + member.age);
            System.out.println("점수 : " + member.grade);
        }

    }
}
