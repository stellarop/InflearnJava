package Intermediate2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 종료(0)");
        while (bool){
            int num = scanner.nextInt();
            if(num == 0){
                bool = false;
            }else{
                list.add(num);
            }
        }

        System.out.println("출력");
        String arr = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if(i < list.size() - 1){
                sb.append(", ");
            }

        }

        arr = sb.toString();
        System.out.println(arr);

    }
}
