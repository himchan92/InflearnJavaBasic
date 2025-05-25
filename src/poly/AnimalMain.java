package poly;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();

        System.out.println("동물소리테스트 시작");
        sound(cow);
    }

    private static void sound(Cow caw) {
        caw.sound();
    }
}
