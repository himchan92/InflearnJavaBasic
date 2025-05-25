package poly;

public class Fly implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("왱왱");
    }

    @Override
    public void move() {
        System.out.println("파리 이동");
    }
}
