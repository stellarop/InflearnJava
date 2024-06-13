package basic.extends1.ex;

public class Album extends Item{
    // 아티스트
    private String arist;

    public Album(String name, int price, String arist) {
        super(name, price);
        this.arist = arist;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("-아티스트 : " + arist);
    }
}
