package basic.final1.ex;

public class MembarMain {
    public static void main(String[] args) {
        Membar membar = new Membar("root", "루트");
        membar.print();
        membar.changeData("update id", "수정 이름");
        membar.print();
    }
}
