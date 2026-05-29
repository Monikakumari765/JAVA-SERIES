// Creating a Java class
class Dog {
  String breed;
  int age;
  String color;
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printDetails() {
    System.out.println("Dog detials:");
    System.out.println(this.breed);
    System.out.println(this.age);
    System.out.println(this.color);
  }
}

public class Main {
  public static void main(String[] args) {
    
    Dog obj = new Dog();

    obj.setBreed("Golden Retriever");
    obj.setAge(2);
    obj.setColor("Golden");

    obj.printDetails();
  }
}