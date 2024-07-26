package Intermediate2.collection.set.member;

import Intermediate2.collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        // Object 가 제공하는 hashCode() 는 객체의 참조값을 기반으로 생성하기 때문에
        // 인스턴스마다 다르다.
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        // Object 가 제공하는 equals() 메서드는 == 비교이기 때문에 false
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        // set 자료구조는 hashCode -> hashIndex 기반으로 데이터가 삽입되어야 하는데
        // 위 두 객체는 hashCode 가 다르기 때문에 저장된 인덱스가 다름
        // 중복된 값 2개가 등록이 됨
        System.out.println(set);
        
        // 조회
        // 같은 문자를 가진 객체라도 Object 가 제공하는 hashCode 는 객체마다 다르고
        // hashCode 를 기반으로 생성하는 hashIndex 도 다르기 때문에
        // set 자료구조에서 조회가 불가능하다.
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

    }
}
