package Classes;
public class Dog{
    // Attributes - global variables inside the class.
    public String name;
    public int age;

    // Methods - Functions inside my class
    // Constructor - is a special method
    // Constructor Rules:
        // #1. Must have same name as the class
        // #2. What type? It does not have a type
    // How many constructors can I have
    // You can have multiple constructors*
    // They must have different parameters.
        Dog() {
            name = "Scooby";
            age = 0;
        }
        Dog(String n){
            name = n;
            age = 0;
        }
        Dog(String n, int a){
            name = n;
            age = a;
        }

    
}
