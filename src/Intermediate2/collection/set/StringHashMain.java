package Intermediate2.collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';

        // 문자는 숫자로 치환 가능하다(모든 문자는 고유 숫자가 존재)
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        // hashCode 문자를 넣으면 숫자로 리턴
        // 숫자로 리턴 되니 hashIndex 로 변환 가능
        System.out.println("hashCode('A') : " + hashCode("A"));
        System.out.println("hashCode('B') : " + hashCode("B"));
        System.out.println("hashCode('AB') : " + hashCode("AB"));

        // hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
    }

    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;

        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }

}
