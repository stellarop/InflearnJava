package Intermediate1.enumeration.test;

import Intermediate1.enumeration.ex3.Grade;

public enum AuthGrade2 {
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade2(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    /*
    public static void printMenu(String scanName){

        if(scanName.equals(AuthGrade2.GUEST.name())){
            System.out.println("당신의 등급은 " + AuthGrade2.GUEST.getDescription() + "입니다.");
            System.out.println("== 메뉴 목록 ==");
            System.out.println("- 메인 화면");
        }else if(scanName.equals(AuthGrade2.LOGIN.name())){
            System.out.println("당신의 등급은 " + AuthGrade2.LOGIN.getDescription() + "입니다.");
            System.out.println("== 메뉴 목록 ==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        }else if(scanName.equals(AuthGrade2.ADMIN.name())){
            System.out.println("당신의 등급은 " + AuthGrade2.ADMIN.getDescription() + "입니다.");
            System.out.println("== 메뉴 목록 ==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }else{
            System.out.println("없음");
        }
    }
    */
}
