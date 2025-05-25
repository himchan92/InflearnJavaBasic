package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] p = new ProductOrder[3];

        ProductOrder p1 = new ProductOrder();
        p1.price = 1000;
        p1.productName = "스프링";
        p1.quantity = 100;
        p[0] = p1;

        ProductOrder p2 = new ProductOrder();
        p2.price = 2000;
        p2.productName = "부트";
        p2.quantity = 50;
        p[1] = p2;

        ProductOrder p3 = new ProductOrder();
        p3.price = 3000;
        p3.productName = "도커";
        p3.quantity = 120;
        p[2] = p3;

        for(ProductOrder order : p) {
            System.out.println(order.price + ", " + order.productName + ", " + order.quantity);
        }
    }
}
