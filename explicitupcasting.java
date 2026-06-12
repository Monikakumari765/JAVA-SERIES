class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class explicitupcasting {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d;   // Upcasting (implicit)

        a.sound();
    }
}