class Dog {
    // Declaring and initializing the attributes
    String breed = "German Shepherd";
    int age = 2;
    String color = "Black";
}

public class Main1 {
    public static void main(String[] args) {
        // Creating an object of the class Dog
        Dog obj = new Dog();

        // Accessing class attributes & printing the values
        System.out.println(obj.breed);
        System.out.println(obj.age);
        System.out.println(obj.color);
    }
}