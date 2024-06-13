package basic.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 16, 19);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 18, 76);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members){
            System.out.println("이름 : " + member.name);
            System.out.println("나이 : " + member.age);
            System.out.println("점수 : " + member.grade);
        }

    }

}
