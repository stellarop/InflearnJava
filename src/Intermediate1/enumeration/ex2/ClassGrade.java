package Intermediate1.enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 외부에서 인스턴스 생성 못하게 막음
    private ClassGrade(){

    }
}
