package poly;

public class Bird implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("푸드득");
    }

    @Override
    public void move() {
        System.out.println("비둘기 날개짓");
    }
}
