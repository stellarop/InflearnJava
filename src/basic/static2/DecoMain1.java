package basic.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "java";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        System.out.println("be : " + s);
        System.out.println("af : " + decoUtil1.deco(s));

    }
}
