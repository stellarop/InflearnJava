package basic.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 이름은 클래스 이름과 동일
    // 반환 타입 x
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출");
        System.out.println("이름 : " + name + " 나이 : " + age + " 점수 : " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 추가
    MemberConstruct(String name, int age){
        // this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
        // this 는 인스턴스 자신의 참조값을 가르킨다.
        // 자신의 생성자를 호출
        this(name, age, 50);
    }
}
