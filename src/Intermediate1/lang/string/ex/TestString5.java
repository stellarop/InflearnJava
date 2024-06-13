package Intermediate1.lang.string.ex;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        String str1 = str.substring(0,str.indexOf(ext));
        String ext1 = str.substring(str.indexOf(ext), str.length());
        System.out.println(str1);
        System.out.println(ext1);

    }
}
