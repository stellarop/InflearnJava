package Intermediate1.enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        for (AuthGrade1 authGrade : AuthGrade1.values()){
            System.out.println("grade : " + authGrade.name() + ", level : " + authGrade.getLevel()
                    + ", 설명 : " + authGrade.getDescription());
        }
    }
}
