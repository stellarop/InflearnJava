package basic.construct;

public class MemberDefault {
    String name;

    // 생성자가 없으면 기본 생성자가 자동으로 생성된다
    // 생성자가 하나라도 존재하면 기본 생성자 제공 x
    MemberDefault(){
        System.out.println("기본 생성자 호출");
    }
}
