package enumeration;

public class DiscountService2 {

    public int discount(Grade grade, int price) {
        int percent = 0;

        if(grade.equals(grade.BASIC)) {
            percent = 10;
        } else if(grade.equals(grade.GOLD)) {
            percent = 20;
        } else if(grade.equals(grade.DIAMOND)) {
            percent = 30;
        } else {
            System.out.println("할인x");
        }

        return price * percent / 100;
    }
}
