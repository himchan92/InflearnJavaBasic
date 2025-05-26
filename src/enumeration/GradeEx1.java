package enumeration;

import static enumeration.Grade.BASIC;
import static enumeration.Grade.DIAMOND;
import static enumeration.Grade.GOLD;

public class GradeEx1 {

    public static void main(String[] args) {
        // ENUM 사용이유 : 타입 안정성 보장, 컴파일 시 오류감지가능, 디버깅 가능
        int price = 1000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
