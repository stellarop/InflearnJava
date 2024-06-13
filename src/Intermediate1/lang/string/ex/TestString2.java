package Intermediate1.lang.string.ex;

public class TestString2 {
    public static void main(String[] args) {
        String[] strArr = {"hello","java", "jvm", "string", "jsp"};

        int totalCount = 0;

        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i] + " : " + strArr[i].length());
            totalCount += strArr[i].length();
        }

        System.out.println("totalCount : " + totalCount);
    }
}
