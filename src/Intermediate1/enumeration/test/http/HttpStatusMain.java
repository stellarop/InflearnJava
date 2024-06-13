package Intermediate1.enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        System.out.println("HTTP CODE : ");

        Scanner scan = new Scanner(System.in);
        int scanCode = scan.nextInt();

        HttpStatus httpStatus = HttpStatus.findByCode(scanCode);

        if(httpStatus == null){
            System.out.println("정의되지 않은 HTTP 상태 코드 입니다.");
        }else{
            System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
            System.out.println("isSuccess : " + httpStatus.isSuccess());
        }
    }
}
