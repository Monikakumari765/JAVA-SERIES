class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class explicitdowncasting  {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting

        Dog d = (Dog) a;       // Downcasting
        d.bark();
    }
}
