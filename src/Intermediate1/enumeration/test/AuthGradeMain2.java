package Intermediate1.enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        String menuListArr[] = {"== 메뉴 목록 ==", "- 메인 화면", "- 이메일 관리 화면","- 관리자 화면"};

        System.out.println("당신의 등급을 입력하세요 " + Arrays.toString(AuthGrade2.values()));

        Scanner scan = new Scanner(System.in);

        String scanName = scan.next();
        // valueOf() = 파라메터로 넘긴 이름과 같은 상수를 리턴
        AuthGrade2 authGrade2 = AuthGrade2.valueOf(scanName);

        System.out.println("당신의 등급은 " + authGrade2.getDescription() + "입니다.");

        for(int i = 0; i <= authGrade2.getLevel(); i++){
            System.out.println(menuListArr[i]);
        }
    }
}
