package Intermediate2.collection.set;

import Intermediate2.collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        Member h1 = new Member("h1");
        // 대문자는 hashCode가 소문자랑 다름
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("h1.hashCode() = " + h1.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(h1);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        Member searchJpa = new Member("JPA");
        boolean result = set.contains(searchJpa.hashCode());
        System.out.println("set.contains : " + searchJpa + ", : " + result);
    }

}
