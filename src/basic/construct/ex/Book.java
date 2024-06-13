package basic.construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    Book(){
        this("제목1", "저자1", 1);
    }

    Book(String title, String author){
        this(title, author, 2);
    }
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }
}
