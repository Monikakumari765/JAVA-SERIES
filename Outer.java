 public class Outer {

    void display() {

        class Inner {
            void show() {
                System.out.println("This is a Local Inner Class");
            }
        }

        Inner obj = new Inner();
        obj.show();
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}