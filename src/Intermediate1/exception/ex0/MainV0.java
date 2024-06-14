package Intermediate1.exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();

            if("exit".equals(input)){
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
