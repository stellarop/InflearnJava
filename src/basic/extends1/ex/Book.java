package basic.extends1.ex;

public class Book extends Item{
    // 저자
    private String author;
    // 도서번호
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        // 부모 클래스 생성자에 공통 변수 넘기고 호출
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    // 부모 클래스 print() 메서드 재정의
    @Override
    public void print(){
        // 부모 클래스 print() 메서드 호출
        super.print();
        System.out.println("-저자 : " + author + ", 도서번호 : " + isbn);
    }

}
