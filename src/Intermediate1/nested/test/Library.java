package Intermediate1.nested.test;

public class Library {
    private int booksIndex = 0;
    // private Book[] books = new Book[bookListSize];
    private Book[] books;
    public Library(int bookListSize) {
        books = new Book[bookListSize];
    }

    public void addBook(String title, String author){

        System.out.println(booksIndex);
        if(booksIndex >= 4){
            System.out.println("도서관 저장 공간이 부족합니다.");
        }else{
            books[booksIndex] = new Book(title, author);
            booksIndex++;
        }
    }

    public void showBooks(){
        System.out.println("=== 책 목록 출력 ===");
        for (Book bookList : books){
            System.out.println("도서 제목 : " + bookList.title + ", 저자 : " + bookList.author);
        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }


}
