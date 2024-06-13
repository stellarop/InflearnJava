package basic.final1.ex;

public class Membar {
    private final String id;

    private String name;

    public Membar(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        // this.id = id; final 변수는 값 변경 불가능
        this.name = name;
    }

    public void print(){
        System.out.println("id : " + id + " name : " + name);
    }
}
