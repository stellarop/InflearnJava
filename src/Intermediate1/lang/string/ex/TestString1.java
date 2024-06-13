package Intermediate1.lang.string.ex;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.google.com";

        if(url.startsWith("https://")){
            System.out.println("https:// 문자열 존재");
        }else{
            System.out.println("https:// 문자열 미존재");
        }

        System.out.println(url);
        

    }
}
