package Intermediate1.exception.ex4;

import Intermediate1.exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();

            if("exit".equals(input)){
                break;
            }

            try {
                networkService.sendMessage(input);
            }catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("===개발자용 디버깅 메시지===");
        // 스텍 트레이스 출력
        e.printStackTrace(System.out);

        // 필요시 예외 별로 추가 처리 가능
        // 모든 예외를 전부 해결할 수 없으니 예외를 공통으로 잡고 따로 처리가 필요한 예외는 따로 빼서 추가로 처리
        if(e instanceof SendExceptionV4 sendExceptionV4){
            System.out.println("[전송 오류] 전송 데이터 : " + sendExceptionV4.getSendData());
        }
    }
}
