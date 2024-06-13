package basic.class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 70;

        // Student 클래스 타입의 배열 선언
        // Student 타입의 변수는 Student 인스턴스의 참조값을 보관한다.
        Student[] students = new Student[2];

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        // Students 배열에 student1 참조값 대입
        students[0] = student1;
        // Students 배열에 student2 참조값 대입
        students[1] = student2;



        // 최종적으로 Student 클래스 타입의 배열안에 Student 클래스 타입 변수의 참조값이 존재
        for(Student s : students){
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 점수 : " + s.grade);
        }


    }
}
