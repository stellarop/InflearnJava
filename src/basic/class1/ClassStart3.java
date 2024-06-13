package basic.class1;

// 사용자가 직접 정의하는 사용자 정의타입을 만드려면 설계도가 필요하다. 이 설계도가 클래스이다.
// 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
public class ClassStart3 {
    public static void main(String[] args) {
        // 첫번째 학생을 담아두는 변수 선언
        Student student1;
        // 학생 변수에 실제 학생 클래스 객체 대입
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 두번째 학생 변수에 학생 클래스 객체 대입
        // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값을 반환
        // new 키워드를 통해 객체가 생성되면 참조값을 반환
        // 객체에 대입한 변수(student2)는 메모리에 존재하는 실제 학생 객체의 참조값을 가지고 있음
        // 리턴된 참조값을 가지고 해당 참조값에 있는 객체에 접근 가능하다.
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 70;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 점수 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 점수 : " + student2.grade);
    }
}
