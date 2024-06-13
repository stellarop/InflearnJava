package basic.construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 사용
        Book book1 = new Book();
        // title 과 author 만 파라메터로 받는 생성자
        Book book2 = new Book("제목2", "저자2");
        // 모든 필드를 파라메터로 받는 생성자
        Book book3 = new Book("제목3", "저자3", 3);

        Book[] books = {book1, book2, book3};

        for (Book book : books){
            System.out.println("제목 : " + book.title + " 저자 : " + book.author + " 페이지 :  " + book.page);
        }
    }
}
