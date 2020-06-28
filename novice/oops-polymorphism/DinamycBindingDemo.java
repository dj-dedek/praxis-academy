
class Animal {
    public Animal() {
        // this(5);
        System.out.println("A-const");
    }
    public Animal(int age) {
        this();
        System.out.println("A-age:"+age);
    }
    void speak() {
        System.out.println("Animal is speaking");
    }
}

class Dog extends Animal {
    public Dog() {
        super(10);
        System.out.println("D-const");
    }
    void speak() {
        System.out.println("Dog is Barking");
    }
}

public class DinamycBindingDemo {
    public static void main(String[] args) {
        // Normal overriding
        Dog dog = new Dog();
        dog.speak(); // Dog is Barking

        /*
            // Dynamic binding
            Animal animal = new Dog();
            animal.speak(); // Dog is Barking
        */
    }
}