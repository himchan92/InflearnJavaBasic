package poly;

public class InterfaceAnimalMain {

    public static void main(String[] args) {
        Bird b = new Bird();
        Fly f = new Fly();
        sound(b);
        sound(f);
    }

    private static void sound(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
        interfaceAnimal.move();
    }
}
