class defaultargument {

    void display() {
        display("Monika");   // default value
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        defaultargument obj = new defaultargument();

        obj.display();         // uses default value
        obj.display("Aniket");  // user-provided value
    }
}