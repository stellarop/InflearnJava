package basic.ref;

public class Method2 {
    public static void main(String[] args) {
        // 리턴 받은 객체를 Student 클래스 객체에 대입(당연히 참조값도 들어있음)
        Student student1 = createStudent("이름1", 15, 90);
        Student student2 = createStudent("이름2", 13, 60);
        // 출력 메서드에 파라메터로 넘겨줌
        printStudent(student1);
        printStudent(student2);
    }

    // 메서드 내부에서 인스턴스를 생성 후 참조값을 메서드 외부로 반환
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }


    // 전달한 학생 객체의 필드값을 출력
    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 점수 : " + student.grade);
    }
}
