package Intermediate2.collection.set.member;

public class MemberNoHashNoEq {
    //객체에 hashCode(), equals() 가 없다면
    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
