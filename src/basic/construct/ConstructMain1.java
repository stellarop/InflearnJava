package basic.construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 생성자는 인스턴스를 생성하고 나서 즉시 호출됨
        // new 키워드를 사용해서 객체를 생성할 때 괄호를 붙히는 이유도 생성자 때문이다.
        // 객체를 생성하면서 동시에 생성자를 호출하는 의미도 포함된다.
        // 생성자는 객체를 생성할 때 직접 정의한 생성자가 있다면. 정의한 생성자를 반드시 호출해야 된다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 17, 75);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members){
            System.out.println("name : " + member.name + " age : " + member.age + " grade : " + member.grade);
        } 
    }
}
