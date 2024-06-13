package basic.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        // MovieReview 클래스 객체 생성 후 참조값 리턴
        MovieReview movieReview1 = new MovieReview();
        // 참조값 변수 필드에 값 대입
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화";

        // MovieReview 클래스 배열 생성 후 배열 참조값 리턴
        MovieReview[] movieReviews = new MovieReview[2];
        // 배열 참조값에 참조변수 대입
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        for(MovieReview mr : movieReviews){
            System.out.println("영화 제목 : " + mr.title + ", " + "리뷰 : " + mr.review);
        }


    }
}
