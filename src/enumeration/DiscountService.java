package enumeration;

public class DiscountService {

    public int discount(String grade, int price) {
        int percent = 0;

        if(grade.equals("BASIC")) {
            percent = 10;
        } else if(grade.equals("GOLD")) {
            percent = 20;
        } else if(grade.equals("DIAMOND")) {
            percent = 30;
        } else {
            System.out.println("할인x");
        }

        return price * percent / 100;
    }
}
