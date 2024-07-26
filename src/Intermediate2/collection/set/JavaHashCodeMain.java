package Intermediate2.collection.set;

import Intermediate2.collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object 의 기본 hashCode 는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        // 각 클래스마다 hashCode 를 오버라이딩 해둠
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        // hashCode 는 마이너스 값이 들어올 수 있다
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 비교
        // 인스턴스(주소값)은 다르지만 equals 는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode 를 오버라이딩 한 경우와 하지 않은 경우를 비교
        System.out.println("member1 == member2 : " + (member1 == member2));
        System.out.println("member1.equals(member2) : " + (member1.equals(member2)));

        // Object 가 기본으로 제공하는 hashCode() 는 인스턴스의 참조값을 기반으로 생성되기 때문에
        // 인스턴스 마다 hashCode 가 다르다
        // 하지만 각 객체마다 hashCode() 메서드를 재정의를 하고 데이터의 값이 같으면 같은 hashCode 를 리턴한다

        // hashCode 가 같아야 hashIndex 에서 같은 객체의 값을 찾을 수 있다
        System.out.println("member1.hashCode() : " + member1.hashCode());
        System.out.println("member1.hashCode() : " + member2.hashCode());

    }
}
