package Intermediate2.collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> map = new HashMap();
    
    public void save(Member member){
        map.put(member.getId(), member);
    }
    
    public void remove(String id){
        map.remove(id);
    }
    
    public Member findById(String id){
        Member member = map.get(id);
        return member;
    }
    
    public Member findByName(String name){
        for (String key : map.keySet()) {
           if(map.get(key).equals(name)){
               Member member = map.get(key);
               return member;
           }
        }
        return null;
    }
}
