package Intermediate1.enumeration.ref3;


public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        // Grade.values() 메서드가 Grade 에 들어있는 상수를 배열로 반환하므로 for 문 돌려서 호출
        for(Grade grade : Grade.values()){
            System.out.println(grade.name() + " : " + grade.disCount(price));
        }

    }
}
