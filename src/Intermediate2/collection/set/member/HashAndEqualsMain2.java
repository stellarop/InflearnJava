package Intermediate2.collection.set.member;

import Intermediate2.collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        // Object 가 제공하는 hashCode() 는 객체의 참조값을 기반으로 생성하기 때문에
        // 인스턴스마다 다르다.
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        // Object 가 제공하는 equals() 메서드는 == 비교이기 때문에 false
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 값 비교를 equals()가 아닌 인스턴스 객체의 참조값으로 비교하기 때문에 중복된 값이 삽입된다.
        set.add(m1);
        set.add(m2);
        // set 자료구조는 hashCode -> hashIndex 기반으로 데이터가 삽입되어야 하는데
        // 위 두 객체는 hashCode 가 다르기 때문에 저장된 인덱스가 다름
        // 중복된 값 2개가 등록이 됨
        System.out.println(set);
        
        // 조회
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        // 마찬가지로  equals()가 아닌 인스턴스 객체의 참조값으로 비교하기 때문에 false
        // set.contains() 메서드 contains() 에서 for 문을 돌아서 값을 조회한다.
        // 이때 값 비교는 MemberOnlyHash 안에 equals() 를 재정의 하지 않았으므로
        // Object 의 equals() 가 실행된다.(== 비교) 재정의 시 equals 로 비교
        // 따라서 참조값을 비교해서 조회하므로 false 가 리턴된다.
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

    }
}
