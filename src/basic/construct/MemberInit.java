package basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // initMember 메서드는 member의 초기값 설정 기능을 제공하는 메서드
    void initMember(String name, int age, int grade){
        // this는 자기 자신의 인스턴스(참조값)을 가르킨다
        // 참조값.필드변수.파라메터
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
