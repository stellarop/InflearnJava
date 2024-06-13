package basic.class1;

public class ClassStart2 {
    public static void main(String[] args) {

        String nameArr[] = {"학생1", "학생2"};
        int ageArr[] = {15, 17};
        int gradeArr[] = {90, 85};

        for(int i = 0; i < nameArr.length; i++){
            System.out.println("이름 : " + nameArr[i] + " 나이 : " + ageArr[i] + " 점수 : " + gradeArr[i]);
        }

    }
}
