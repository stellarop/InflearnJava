package Intermediate2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        boolean insert = true;
        boolean select = true;

        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new HashMap();

        System.out.println("==단어 입력 단계==");
        while (insert){

            System.out.println("영어 단어를 입력하세요 (종료는 'q') :" + scanner.nextLine());
            if("q".equals(scanner.nextLine())){
                insert = false;
            }

            String str1 = scanner.nextLine();

            System.out.println("한글 뜻를 입력하세요 (종료는 'q') :" + scanner.nextLine());
            String str2 = scanner.nextLine();

            map.put(str1, str2);
        }

        System.out.println(map);

        System.out.println("==단어 검색 단계==");
        while (select){
            System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q') :" + scanner.nextLine());
            if("q".equals(scanner.nextLine())){
                select = false;
            }
            System.out.println(scanner.nextLine() + "의 뜻 : " + map.get(scanner.nextLine()));
        }

        System.out.println("종료");
    }
}
