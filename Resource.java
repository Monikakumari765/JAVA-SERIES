
public class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Resource acquired.");
    }

    @Override
    public void close() {
        System.out.println("Resource released.");
    }

    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            System.out.println("Using the resource.");
        } // close() is automatically called here
        System.out.println("End of program.");
    }
}