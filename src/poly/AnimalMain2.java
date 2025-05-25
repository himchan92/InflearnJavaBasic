package poly;

public class AnimalMain2 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        sound(cat);
        sound(cow);
        sound(dog);
    }

    private static void sound(Animal animal) {
        animal.sound();
    }
}
