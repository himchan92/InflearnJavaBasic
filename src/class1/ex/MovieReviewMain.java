package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview m = new MovieReview();
        m.title = "아바타";
        m.review = "1편만 재미";

        System.out.println(m.title + ", " + m.review);
    }
}
