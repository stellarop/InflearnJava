package basic.ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // 참조형은 메서드를 호출할 때 참조값을 전달한다.
        // 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나 값을 읽어서 사용한다.
        // student1 참조값, 전달한 하생 객체의 필드 값을 설정
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 11, 67);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    // 전달한 학생 객체의 필드값을 출력
    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 점수 : " + student.grade);
    }
}
