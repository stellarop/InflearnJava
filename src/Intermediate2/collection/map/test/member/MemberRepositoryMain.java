package Intermediate2.collection.map.test.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "회원1");
        Member member2 = new Member("id2", "회원2");
        Member member3 = new Member("id3", "회원3");

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);

        Member findMember1 = memberRepository.findById("id1");
        System.out.println("findMember1 : " + findMember1);

        Member findMember2 = memberRepository.findByName("회원2");
        System.out.println("findMember2 : " + findMember2);

        memberRepository.remove("id1");
        Member removeMember1 = memberRepository.findById("id1");
        System.out.println("findMember1 : " + findMember1);


    }
}
