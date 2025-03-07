package middle1.lang.enumeration.ex2;

public class DiscountService {

    //ENUM 클래스 도입(파라미터 적용)
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        }
        else if(classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        }
        else if(classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        }
        else {
            System.out.println("할인x");
        }

        return price * discountPercent / 100;
    }
}
