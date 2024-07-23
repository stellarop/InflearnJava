package Intermediate2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 종료(0)");
        while (true){
            int num = scanner.nextInt();

            if(num == 0){
                break;
            }else{
                list.add(num);
            }
        }

        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double avg = (double) total / list.size();

        System.out.println("합계 : " + total);
        System.out.println("평균 : " + avg);

    }
}
