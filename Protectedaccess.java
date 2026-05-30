class Animal {
    // Protected data member
    protected String name = "Dog";
}

class Dog extends Animal {
    void display() {
        // Accessing protected member
        System.out.println("Animal Name: " + name);
    }
}

public class Protectedaccess{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
