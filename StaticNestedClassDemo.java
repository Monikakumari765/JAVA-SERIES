// Outer class
class OuterClass {
    // Static member
    static int outer_x = 10;
    // Non-static member
    int outer_y = 20;
    // Private static member
    private static int outer_private = 30;
    // Static nested class
    static class StaticNestedClass {
        void display() {
            
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_private = " + outer_private);
            OuterClass out = new OuterClass();
            System.out.println("outer_y = " + out.outer_y);
        }
    }
}
// Driver class
public class StaticNestedClassDemo {
    public static void main(String[] args) {
        // Create object of static nested class
        OuterClass.StaticNestedClass nestedObject =
                new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}

